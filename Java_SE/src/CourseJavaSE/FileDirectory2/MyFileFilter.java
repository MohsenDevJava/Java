package CourseJavaSE.FileDirectory2;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

    boolean flag;

    public MyFileFilter(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean accept(File pathname) {
        if (flag)
            return pathname.isFile();
        return pathname.isDirectory();
    }
}
