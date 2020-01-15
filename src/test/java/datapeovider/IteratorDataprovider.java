package datapeovider;

import model.Student;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author huyif
 * @Description: IteratorDataprovider
 * @date 2019/6/24 22:49
 */
public class IteratorDataprovider {

    @DataProvider
    public Iterator<Object[]> getStudent()
    {
        List<Object[]> objects=new ArrayList<Object[]>();
        return Arrays.asList(new Object[]{new Student(1,"efefe")},new Object[]{new
                Student(2,"tttttt")}).iterator();

    }
    @Test(dataProvider = "getStudent")
    public void test1(Object[] objects)
{
    for (Object object : objects) {
        System.out.println(object);
    }
}

}
