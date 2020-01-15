package factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryTest2 {
    @Factory
    public Object[] excution()
    {
        return  new Object[]{new FactoryTest2()};
    }

    @Test
    public void sout1()
    {
        System.out.println("num:"+2);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
