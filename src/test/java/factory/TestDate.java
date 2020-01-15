package factory;

import model.Student;
import org.testng.annotations.Test;

import java.util.Random;

public class TestDate {

    @Test
    public void test1()
    {
        Student efefe = new Student(1, "efefe");
        efefe.setName(String.valueOf(new Random().nextInt(10000)));
        System.out.println("hello world!!!!111111"+efefe);
    }
    @Test
    public void  test2()
    {
        System.out.println("test22222222222");
    }
}
