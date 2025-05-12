import java.io.File;

public class Main {
Main m = new Main();

    public static void main(String[] args) {
        System.out.println("disks: " );
        File [] roots = File.listRoots();
        for (File root : roots) {
            System.out.println("* " + root.getAbsolutePath());


        }
    }
}

