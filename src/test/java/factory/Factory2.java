package factory;

import org.testng.annotations.Factory;

/**
 * @author huyif
 * @Description: Factory2
 * @date 2019/6/24 22:00
 */
public class Factory2 {
//在带有@Factory注解的方法中调用被执行的测试类,TestNg会自动调用被执行类中带有@Test注解的方法
    @Factory
    public Object[] loadTestClass()
{
    return new Object[]{new FactoryTest()};
}
}
