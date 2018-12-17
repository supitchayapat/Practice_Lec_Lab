import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws IOException {
//        File newDir = new File("newDir");
//        File newFile = new File("newDir" + System.getProperty("file.separator") + "test.txt");
//        try {
//            newDir.mkdir();
//            newFile.createNewFile();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (String fileName : newDir.list()) {
//            System.out.println(fileName);
//        }
        String fileSep=System.getProperty("file.saparator");
        File jar=new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String jarPath=jar.getAbsoluteFile().getAbsolutePath()+fileSep;
        File newFile = new File(jarPath+"test.text");
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(newFile, true));
            printWriter.printf("[%s]Current Dir : %s\n", LocalTime.now(),System.getProperty("user.dir"));
            printWriter.close();
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(newFile, true));
            printWriter.println("test6");
            printWriter.printf("%d test print format", 1);
            printWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        }
}
