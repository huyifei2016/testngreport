package datapeovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author huyif
 * @Description: dataprovider1
 * @date 2019/6/24 22:43
 */
public class Dataprovider1 {
    @DataProvider
    public Object[][] numbers()
    {
        return new  Object[][]{};
    }
    @Test(dataProvider = "numbers")
    public void test2(String number)
    {
        System.out.println(number);
    }


}
