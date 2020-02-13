package smoke;

import newlistener.MyTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Listeners(MyTestListener.class)
public class Smoke {
    @Test(groups = "smoke")
    public void test1()
    {
        System.out.println("smoke11111");
    }
    @Test
    public void test2()
    {
        System.out.println("smoke2222");
    }
    @Test
    public void regexTest()
    {
        String string="hello world!!";
        String regexString="hello\\s+world!!";
        Pattern pattern=Pattern.compile(regexString);
        Matcher matcher=pattern.matcher(string);
        System.out.println(matcher.matches());
    }
}
