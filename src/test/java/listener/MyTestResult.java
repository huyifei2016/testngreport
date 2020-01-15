package listener;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.Set;

public class MyTestResult implements ITestResult {
    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public void setStatus(int i) {

    }

    @Override
    public ITestNGMethod getMethod() {
        return null;
    }

    @Override
    public Object[] getParameters() {
        return new Object[0];
    }

    @Override
    public void setParameters(Object[] objects) {

    }

    @Override
    public IClass getTestClass() {
        return null;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }

    @Override
    public void setThrowable(Throwable throwable) {

    }

    @Override
    public long getStartMillis() {
        return 0;
    }

    @Override
    public long getEndMillis() {
        return 0;
    }

    @Override
    public void setEndMillis(long l) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public String getHost() {
        return null;
    }

    @Override
    public Object getInstance() {
        return null;
    }

    @Override
    public String getTestName() {
        return null;
    }

    @Override
    public String getInstanceName() {
        return null;
    }

    @Override
    public ITestContext getTestContext() {
        return null;
    }

    @Override
    public int compareTo(ITestResult o) {
        return 0;
    }

    @Override
    public Object getAttribute(String s) {
        return null;
    }

    @Override
    public void setAttribute(String s, Object o) {

    }

    @Override
    public Set<String> getAttributeNames() {
        return null;
    }

    @Override
    public Object removeAttribute(String s) {
        return null;
    }
}
