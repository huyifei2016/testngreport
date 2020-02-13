package utils;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileFilter;

public class RFileUtils {
    private static String dir=System.getProperty("user,dir")+"\\testutput\\";
    private static File fileDir=new File(dir);
    protected void removeEmptyDirectories(File outputDirectory)
    {

        if (outputDirectory.exists())
        {
            for (File file : outputDirectory.listFiles(new EmptyDirectoryFilter()))
            {
                file.delete();
            }
        }
    }

    public void creatDirAndFile(String fileName)
    {
        removeEmptyDirectories(fileDir);


    }

    public static void main(String[] args) {


    }

    private static final class EmptyDirectoryFilter implements FileFilter
    {
        public boolean accept(File file)
        {
            return file.isDirectory() && file.listFiles().length == 0;
        }
    }
}
