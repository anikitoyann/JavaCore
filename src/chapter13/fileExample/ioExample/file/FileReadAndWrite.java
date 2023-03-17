package chapter13.fileExample.ioExample.file;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\User\\IdeaProjects\\Java Core\\src\\chapter13\\fileExample\\ioExample\\file\\text.txt";

    public static void main(String[] args) {
        write();
         read();
    }

    public static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write(" Hello Fro m Java\n");
            bw.write("helooo java line 2!!!!!!!!!!!!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
         String line="";
         while((line=br.readLine())!=null){
             System.out.println(line);
         }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
