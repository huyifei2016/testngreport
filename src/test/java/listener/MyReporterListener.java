package listener;

import model.Log;
import model.RunResult;
import org.apache.commons.io.FileUtils;
import org.testng.*;
import org.testng.xml.XmlSuite;
import utils.ExcelUtils;

import java.util.*;


public class MyReporterListener implements IReporter {


    private void organiseByClass(Set<ITestResult> testResults,
                                 Map<IClass, RunResult> flattenedResults) {
        for (ITestResult testResult : testResults) {
            getResultsForClass(flattenedResults, testResult).addResult(testResult);
        }
    }


    /**
     * Look-up the results data for a particular test class.
     * 获取返回结果的testclass,放入flattenedResults这个map中，new testClassResults 类
     */
    private RunResult getResultsForClass(Map<IClass, RunResult> flattenedResults,
                                         ITestResult testResult) {


        RunResult resultsForClass = flattenedResults.get(testResult.getTestClass());
        if (resultsForClass == null) {
            resultsForClass = new RunResult(testResult.getTestClass());
            flattenedResults.put(testResult.getTestClass(), resultsForClass);
        }
        return resultsForClass;
    }


    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

        List<Log> logs = new ArrayList<>();
        Collection<RunResult> runResults = flattenResults(list1);
        runResults.stream().forEach(runResult -> {
            logs.addAll(buildLog(runResult.getFailedTests()));
            logs.addAll(buildLog(runResult.getPassedTests()));
            logs.addAll(buildLog(runResult.getSkippedTests()));
        });
        System.out.println(logs);
        ExcelUtils.writeExcelWithModel(logs);
    }
        /*   int CREATED = -1;
    int SUCCESS = 1;
    int FAILURE = 2;
    int SKIP = 3;
    int SUCCESS_PERCENTAGE_FAILURE = 4;
    int STARTED = 16;*/

    public Log addLog(ITestResult testResult) {
        Log log = new Log();
        if (testResult != null) {
            log.setTestClass(testResult.getTestClass().getName());
            log.setMethod(testResult.getMethod().getMethodName());
            log.setStatus(testResult.getStatus());

            switch (testResult.getStatus()) {
                case 1:
                    log.setResult("pass");
                    break;
                case 2:
                    log.setResult("fail");
                    break;
                case 3:
                    log.setResult("skip");
                    break;
                case 4:
                    log.setResult("SUCCESS_PERCENTAGE_FAILURE");
                    break;
                default:
                    log.setResult("null");

            }
            log.setSuitName(testResult.getTestContext().getSuite().getName());
            if (testResult.getThrowable() != null)
                log.setExceptionInfo(testResult.getThrowable().getMessage());
        }
        return log;
    }


    private List<Log> buildLog(Collection<ITestResult> iTestResults) {
        List<Log> logs = new ArrayList<>();
        iTestResults.stream().forEach(var -> {
            logs.add(addLog(var));
        });
        return logs;
    }

    private Collection<RunResult> flattenResults(List<ISuite> suites) {
        Map<IClass, RunResult> flattenedResults = new HashMap<>();
        for (ISuite suite : suites) {
            for (ISuiteResult suiteResult : suite.getResults().values()) {
                // Failed and skipped configuration methods are treated as test failures.
                organiseByClass(suiteResult.getTestContext().getFailedConfigurations().getAllResults(), flattenedResults);
                organiseByClass(suiteResult.getTestContext().getSkippedConfigurations().getAllResults(), flattenedResults);
                // Successful configuration methods are not included.

                organiseByClass(suiteResult.getTestContext().getFailedTests().getAllResults(), flattenedResults);
                organiseByClass(suiteResult.getTestContext().getSkippedTests().getAllResults(), flattenedResults);
                organiseByClass(suiteResult.getTestContext().getPassedTests().getAllResults(), flattenedResults);
            }
        }
        return flattenedResults.values();
    }

}
