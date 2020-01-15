package excution;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;

import java.io.IOException;
import java.util.List;

public class Excution {
    @Test
    public void test1()
    {
        String suiteFile=System.getProperty("user.dir")+"\\src\\test\\resources\\groups\\factory\\factory.xml";
        List<XmlSuite> suites=null;
        try {
            suites=new Parser(suiteFile).parseToList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        TestNG testNG=new TestNG();
        testNG.setXmlSuites(suites);
        testNG.run();

    }
}
