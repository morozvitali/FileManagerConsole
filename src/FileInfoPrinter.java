import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfoPrinter {

    public static void printInfo (File file) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("--------------------------------------------------------");
        System.out.println("Name:       " + file.getName());
        System.out.println("Path:       " + file.getAbsolutePath());
        System.out.println("Type:       " + (file.isDirectory() ? "Direory" : "File"));
        System.out.println("Size:       " + (file.isFile() ? file.length() + " bytes" : "-"));
        System.out.println("Last Modified: " + sdf.format(new Date(file.lastModified())));


    }

}
