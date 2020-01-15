package dependecy;

import org.testng.annotations.Test;

public class Dependecy1 {
    @Test(dependsOnMethods = "test5")
    public void test1()
    {
        System.out.println("test1");
    }
    @Test(dependsOnGroups = "group1")
    public void test2()
    {
        System.out.println("test2");
    }
    @Test(groups = {"group1"})
    public void test3()
    {
        System.out.println("test3");
    }
    @Test(groups = {"group1"})
    public void test4()
    {
        System.out.println("test4");
    }
    @Test
    public void test5()
    {
        System.out.println("test5");
    }

}
