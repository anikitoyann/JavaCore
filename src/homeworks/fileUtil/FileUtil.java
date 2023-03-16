package homeworks.fileUtil;

import homeworks.employee.Commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
                if (file.createNewFile()) {
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