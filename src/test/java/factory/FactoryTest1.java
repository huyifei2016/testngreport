package factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryTest1 {

    @Factory
    public Object[] excution()
    {
     return  new Object[]{new FactoryTest1(),new FactoryTest2(),new FactoryTest3()};
    }

    @Test
    public void sout1()
    {
        System.out.println("num:"+1);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
