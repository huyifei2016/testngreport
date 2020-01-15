package example;


import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Main {

    public static void main(String[] args) {
        TestListenerAdapter testListenerAdapter=new TestListenerAdapter();
        TestNG testNG=new TestNG();
        testNG.setTestClasses(new Class[]{MyTest.class});
        testNG.addListener(testListenerAdapter);
       // testNG.setOutputDirectory("newOutput");
        testNG.run();

    }
}
