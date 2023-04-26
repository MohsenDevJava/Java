package CourseJavaSE.FileDirectory2;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileNameFilter implements FilenameFilter {

    String[] exts;

    public MyFileNameFilter(String...exts) {
        this.exts = exts;
    }

    @Override
    public boolean accept(File dir, String name) {
        for (String ext:exts){
            if (name.endsWith(ext))
                return true;
        }
        return false;
    }
}
