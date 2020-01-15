package parallel;

import listener.MyReporterListener;
import listener.MyTestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ MyReporterListener.class})
@Test
public class Parallel1 {

    public void tes1()
    {
        System.out.println("thread:"+Thread.currentThread().getName());

    }
    public void test2()
    {
        System.out.println("thread:"+Thread.currentThread().getName());
    }

    public void test3()
    {
        System.out.println("thread:"+Thread.currentThread().getName());
    }
}
