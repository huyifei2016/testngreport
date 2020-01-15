package smoke;

import org.testng.annotations.Test;

import java.security.interfaces.DSAPublicKey;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
