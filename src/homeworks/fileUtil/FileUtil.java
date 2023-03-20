package homeworks.fileUtil;

import java.io.*;
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
                    fileSearch();
                    break;
                case SUMSIZEOFFALDER:
                    System.out.println("Please input folderPath");
                    String folderrPath = scanner.nextLine();
                    printSizeOfPackage(folderrPath);
                    break;
                case CREAT_FILE_WITH_CONTENT:
                    System.out.println("Please input folderPath");
                    String folderPathh = scanner.nextLine();
                    System.out.println("Please input FileName");
                    String fileName = scanner.nextLine();
                    System.out.println("The Contents of the file");
                    String contents = scanner.nextLine();
                    createFileWithContent(folderPathh,fileName,contents);
                    break;
                case CONTENT_SEARCH:
                    System.out.println("Please input folderPath");
                    String folderPath = scanner.nextLine();
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    contentSearch(folderPath,keyword);
                    break;
                case FIND_LINES:
                    System.out.println("Please input file.txt Path");
                    String txtPath = scanner.nextLine();
                    System.out.println("Please input keyword");
                    String keywordd = scanner.nextLine();
                    findLines(txtPath,keywordd);
                    break;

                default:
                    System.out.println("Wrong command");
            }
        }
    }

    static void fileSearch() {
        System.out.println("Please input the path of Folder");
        String folderPath = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            System.out.println("Wrong folder path");
            return;
        }
        File[] files = folder.listFiles();
        boolean isFound = false;
        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);

    }

    static void printSizeOfPackage(String folderrPath) {

        File file = new File(folderrPath);
        if(!file.isDirectory()){
            System.out.println("Wrong folder path");
            return;
        }
        File[] files = file.listFiles();
        long size = 0;
        for (File file1 : files) {
            if (file1.isFile())
                size = size + file.length();

        }
        System.out.println("size = " + size/1024+"  kb");
    }

    static void contentSearch(String folderPath,String keyword) {
        File folderFile = new File(folderPath);
        if (!folderFile.isDirectory()) {
            System.out.println("Wrong folder path");
            return;
        }
        File[] listFiles = folderFile.listFiles();
        for (File file : listFiles) {
            if ((file.isFile() && file.getName().endsWith(".txt"))) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file);
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    static void findLines(String txtPath, String keywordd) {

        File file = new File(txtPath);
        if (!file.exists() || !file.getName().endsWith(".txt")) {
            System.out.println("Wrong file or file path");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                if (line.contains(keywordd))
                    System.out.println(lineNumber + " " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void createFileWithContent(String folderPathh,String fileName,String contents){
            File directory = new File(folderPathh);
            if (!directory.isDirectory()) {
                System.out.println("Wrong folder path");
                return;
            }
                File file = new File(directory, fileName);
              if(file.exists()){
                  System.out.println("File already exist!");
                  return;
        }
              try{
                  boolean newFile=file.createNewFile();
                  if(newFile){
                      try(BufferedWriter fileWriter=new BufferedWriter(new FileWriter(file))){
                          fileWriter.write(contents);
                      }
                  }
              }catch (IOException e){
                  e.printStackTrace();
              }

    }
}