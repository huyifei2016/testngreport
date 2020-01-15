package factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * @author huyif
 * @Description: Factory1
 * @date 2019/6/24 21:43
 */
public class Factory1
{
    @Factory
    public Object[] factoryMethod()
    {
        return new Object[]{new Factory1(),new Factory2()};
    }

    @Test(groups = "smoke")
    public void test1()
    {
        System.out.println("hello11");
    }
    @Test(groups = "smoke")
    public void test2()
    {
        System.out.println("heloo22");
    }

}
