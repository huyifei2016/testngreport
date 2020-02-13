package utils;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.ExcelBuilder;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import model.Log;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ExcelUtils {

public static void writeExcelWithModel(List<Log> logs)
{
    String fileName=String.valueOf(System.currentTimeMillis())+".xlsx";
    WriteSheet sheet=new WriteSheet();
    sheet.setSheetName("test result");
    sheet.setSheetNo(1);
 ExcelWriterBuilder excelBuilder= EasyExcelFactory.write(fileName);
 ExcelWriter excelWriter= excelBuilder.excelType(ExcelTypeEnum.XLSX).head(Log.class).build();
 excelWriter.write(logs,sheet);
 excelWriter.finish();

}
private static String getCurrentTime()
{
    DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
 return dateTimeFormatter.format(LocalDateTime.now());
}

}
