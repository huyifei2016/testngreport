package listener;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public class MyReport implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

        for (XmlSuite xmlSuite : list) {
            System.out.println(xmlSuite.toString());
        }
        for (ISuite iSuite : list1) {
            System.out.println(iSuite.toString());
        }

    }
}
