package chapter13;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);

        String directoryPath = "C:\\Users\\User\\IdeaProjects\\Java Core\\src\\chapter13\\poghos\\petros\\martiros";
        String path = "C:\\Users\\User\\IdeaProjects\\Java Core\\src\\chapter13\\Book.xlsx";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        System.out.println(File.separator);
        System.out.println("IsDirevtory  " + file.isDirectory());
        System.out.println("IsFile  " + file.isFile());
        File directory = new File(directoryPath);
        System.out.println("File size" + file.length());

        File[] files = directory.listFiles();

//        if(!directory.exists()){
//             directory.mkdirs();
//        }
//        for (File f : files) {
//            if (f.isFile()) {
//                System.out.println("name " + f.getName());
//                System.out.println("size" + f.length());
//            }
//
//        }

//        String[] list = directory.list();
//        for (String s : list) {
//            System.out.println(s);
//        }


//        if (newFile.canWrite()) {
//            boolean newFilee = file.createNewFile();
//            if (newFilee) {
//                System.out.println("File created");
//            } else {
//                System.out.println("File not created");
//            }
//        }

    }
}