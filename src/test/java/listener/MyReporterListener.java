package listener;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestNGMethod;
import org.testng.internal.TestNGMethod;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class MyReporterListener implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {
        for (XmlSuite xmlSuite : list) {
            System.out.println(xmlSuite.getName());
        }
        System.out.println(list);
        System.out.println(list1);
        for (ISuite iSuite : list1) {


            iSuite.getResults().forEach((x,y)->{


            });
            for (ITestNGMethod method:iSuite.getAllMethods())
            {
                //System.out.println(method);
            }

          Set<Map.Entry<String, ISuiteResult>> entries=iSuite.getResults().entrySet();
            for (Map.Entry<String,ISuiteResult> entry:entries)
            {
                System.out.println(entry.getValue().getTestContext().getAllTestMethods());
                System.out.println(entry.getValue().getTestContext().getExcludedGroups());
                System.out.println(entry.getValue().getTestContext().getFailedTests());
                entry.getValue().getTestContext().setAttribute("test333",UUID.randomUUID().toString());
//                System.out.println("uuid::"+entry.getValue().getTestContext().getSuite().getAttribute("test333").toString());
                System.out.println("成功的test：："+entry.getValue().getTestContext().getPassedTests().size());
                System.out.println("成功的test：："+entry.getValue().getTestContext().getPassedTests().getAllMethods());
                System.out.println("成功的test：："+entry.getValue().getTestContext().getPassedTests().getAllResults());
                System.out.println("成功的test：："+entry.getValue().getTestContext().getOutputDirectory());


            }

        }
        System.out.println(s);
    }
}
