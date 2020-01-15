package timeout;

import org.testng.annotations.Test;

public class TestTimeOut {

    @Test
    public void test1()
    {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("timeout test!!!");
    }
    @Test
    public void test2()
    {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("timeout test!!!");
    }
}
