package model;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.testng.IClass;
import org.testng.ITestResult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Setter
@Getter
public class RunResult extends AbstractSuiteResult{
    private String suiteName;
    private long duration=0;
    private  final IClass testClass;
    private final Collection<ITestResult> failedTests = new LinkedList<ITestResult>();
    private final Collection<ITestResult> skippedTests = new LinkedList<ITestResult>();
    private final Collection<ITestResult> passedTests = new LinkedList<ITestResult>();
    private List<Log> logList=new ArrayList<>();
    public RunResult(IClass testClass) {
        this.testClass = testClass;
    }

  public void addResult(ITestResult result)
    {
        switch (result.getStatus())
        {
            case ITestResult.SKIP:
            {
                    skippedTests.add(result);
                    break;
            }
            case ITestResult.FAILURE:
            case ITestResult.SUCCESS_PERCENTAGE_FAILURE:
            {
                failedTests.add(result);
                break;
            }
            case ITestResult.SUCCESS:
            {
                passedTests.add(result);
                break;
            }
        }
        duration += (result.getEndMillis() - result.getStartMillis());
    }
    /*
    *    int SUCCESS = 1;
    int FAILURE = 2;
    int SKIP = 3;
    */
    public void addLogs(ITestResult testResult)
    {
        Log log=new Log();
       if(testResult!=null) {
           log.setTestClass(testResult.getTestClass().getName());
           log.setMethod(testResult.getMethod().getMethodName());
           log.setStatus(testResult.getStatus());
           if (testResult.getThrowable() != null)
               log.setExceptionInfo(testResult.getThrowable().getMessage());
           logList.add(log);
       }
            return ;
    }



}
