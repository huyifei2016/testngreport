package group;

import org.testng.annotations.Test;

@Test(groups = "group1")
public class Group1 {
    public void test1()
    {
        System.out.println("group11111test1");
    }
    @Test(groups = "smoke")
    public  void test2()
    {
        System.out.println("grroup11test222");
    }
}
