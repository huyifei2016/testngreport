package factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryTest3 {
    @Factory
    public Object[] excution()
    {
        return  new Object[]{new FactoryTest3()};
    }

    @Test
    public void sout1()
    {
        System.out.println("num:"+3);
    }

}
