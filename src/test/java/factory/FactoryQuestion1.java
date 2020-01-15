package factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryQuestion1 {

/*
* question code below
* dataprovider
*
* */
@DataProvider(name = "excutive")
public Object[][] excutive()
{
    return new Object[][]{new String[]{"efefe","fefe"},new String[]{"efefe","fefe"}};
}
    @Factory(dataProvider = "excutive")
    public Object[] excutiveTest(String str1,String str2)
    {
        System.out.println(str1);
        System.out.println(str2);
        return new Object[]{new TestDate()};
    }

}
