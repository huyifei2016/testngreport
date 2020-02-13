package datapeovider;

import org.testng.annotations.Test;


import java.util.concurrent.Callable;

public class XX {

    enum TestSwitch{
        FIRST,SECOND,THIRED
    }

    public void ww()
    {

    }
    @Test
    public void test1()
    {
        int i=2;

        switch (i){
            case 1:
            case 2:
            case 3:
                System.out.println(1);
                break;
            default:
                System.out.println(4);
        }





    }
}
