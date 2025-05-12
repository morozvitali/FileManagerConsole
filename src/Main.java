import java.io.File;
import java.util.Scanner;

public class Main {
    Main m = new Main();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ///*        показ дисків         */
        System.out.println("disks: ");
        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println("* " + root.getAbsolutePath());

            /*         Введення шляху       */
            System.out.println("Введіть шлях до папки, наприклад C:\\Users): ");
            String path = scanner.nextLine();
            File folder = new File(path);

            /*        Перевірка і вивід вмісту         */
            if (folder.exists() && folder.isDirectory()) {
                File[] files = folder.listFiles();
                if (files != null) {
                    System.out.println("\nВміст папки:");
                    for (File file : files) {
                        String type = file.isDirectory() ? "[DIR] " : "      ";
                        System.out.println(type + file.getName());

            /*      Додотково вивести інфо              */
                        FileInfoPrinter.printInfo(file);
                    }
                } else {
                    System.out.println("⚠️ Не вдалося прочитати вміст папки.");
                }
            } else {
                System.out.println("❌ Вказано невірний шлях або це не папка.");
            }
            scanner.close();
        }
    }
}

