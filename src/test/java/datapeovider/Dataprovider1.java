package datapeovider;

import listener.MyReporterListener;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author huyif
 * @Description: dataprovider1
 * @date 2019/6/24 22:43
 */
@Listeners({MyReporterListener.class})
public class Dataprovider1 {
    @DataProvider
    public Object[][] numbers()
    {
        return new  Object[][]{new String[]{"fefef"}};
    }
    @Test(dataProvider = "numbers")
    public void test2(String number)
    {
        System.out.println(number);
    }   @Test(dataProvider = "numbers")
    public void test1(String number)
    {
        Assert.assertEquals(true,false);
        System.out.println(number);
    }


}
