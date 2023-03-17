package chapter13.fileExample.ioExample.file;

import java.io.*;

public class DataStream {
    private static final String FILE_PATH="C:\\Users\\User\\IdeaProjects\\Java Core\\src\\chapter13\\fileExample\\ioExample\\file\\Example.txt";

    public static void main(String[] args) throws IOException {
   write();
    read();
    }
    public static void write() throws IOException {
        DataOutputStream out=new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(33);
        out.writeBoolean(false);
        out.writeUTF("Hello");
        out.close();
    }
    public static void read() throws IOException {
        DataInputStream input=new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(input.readInt());
        System.out.println(input.readBoolean());
        System.out.println((input.readUTF()));
        input.close();
    }
}
