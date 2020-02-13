package listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListenerAdapter extends TestListenerAdapter {


    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        super.onTestSuccess(iTestResult);
        System.out.println(getPassedTests());
        StringBuilder builder=new StringBuilder();
        builder.append("time:").append(iTestResult.getEndMillis()-iTestResult.getStartMillis()).append("\n")
                .append("method:").append(iTestResult.getMethod().getMethodName());
        System.out.println(builder.toString());

    }
}
