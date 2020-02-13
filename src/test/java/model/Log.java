package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Log {
    private String suitName;
    private String testClass;
    private String method;
    private long time;
    private int status;
    private String result;
    private String exceptionInfo;

    @Override
    public String toString() {
        return "Log{" +
                "suitName='" + suitName + '\'' +
                ", testClass='" + testClass + '\'' +
                ", method='" + method + '\'' +
                ", time=" + time +
                ", status=" + status +
                ", result='" + result + '\'' +
                ", exceptionInfo='" + exceptionInfo + '\'' +
                '}';
    }
}
