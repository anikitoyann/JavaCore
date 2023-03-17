package homeworks.fileUtil;

import homeworks.employee.Commands;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FileUtil implements Command {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        boolean isRun = true;
        while (isRun) {
            Command.printCommand();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case SEARCHFORFILE:
                    System.out.println(fileSearch());
                    break;
                case SUMSIZEOFFALDER:
                    printSizeOfPackage();
                    break;
                case CREAT_FILE_WITH_CONTENT:
                    createFileWithContent();
                    break;
                case CONTENT_SEARCH:
                    contentSearch();
                    break;
                case FIND_LINES:
                    findLines();
                    break;

                default:
                    System.out.println("Wrong command");
            }
        }
    }

    static Boolean fileSearch() {
        System.out.println("Please input the path of Folder");
        String folderPath = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }

    static void printSizeOfPackage() {
        System.out.println("Please input folderPath");
        String folderPath = scanner.nextLine();
        File file = new File(folderPath);
        File[] files = file.listFiles();
        long size = 0;
        for (File file1 : files) {
            if (file1.isFile())
                size = size + file.length();
            System.out.println("size of" + folderPath + " = " + size);
        }
    }

    static void contentSearch() throws IOException {
        System.out.println("Please input folderPath");
        String folderPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        try {
            File directory = new File(folderPath);
            if (directory.exists() && directory.isDirectory()) {
                File[] files = directory.listFiles();
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith("txt")) {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line = "";
                        if ((line = reader.readLine()).contains(keyword)) {
                            System.out.println(file.getName());
                            return;
                        }
                    }
                }
            }
            System.out.println("no txt.f");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void findLines() {
        System.out.println("Please input file.txt Path");
        String txtPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(txtPath))) {
            String line = "";
            if ((line = br.readLine()).contains(keyword)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void createFileWithContent() throws IOException {
        System.out.println("Please input folderPath");
        String folderPath = scanner.nextLine();
        System.out.println("Please input FileName");
        String fileName = scanner.nextLine();
        System.out.println("The Contents of the file");
        String contents = scanner.nextLine();
        try {
            File directory = new File(folderPath);
            if (directory.exists() && directory.isDirectory()) {
                File file = new File(directory, fileName);
                if (file.createNewFile() && file.canWrite()) {
                    FileWriter writer = new FileWriter(file);
                    writer.write(contents);
                    writer.close();
                    System.out.println("File created with contect");
                } else {
                    System.out.println("Filw already exsist");
                }
            } else {
                System.out.println("Directory dos not exist");
            }
        } catch (IOException e) {
            System.err.println("Error creating " + fileName + " in " + folderPath);
            return;

        }

    }
}