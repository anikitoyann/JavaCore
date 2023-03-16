package homeworks.fileUtil;

public interface Command {
    String EXIT = "0";
    String SEARCHFORFILE = "1";
    String SUMSIZEOFFALDER = "2";
    String CREAT_FILE_WITH_CONTENT = "3";


    static void printCommand() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + SEARCHFORFILE + " for search file ");
        System.out.println("Please input " + SUMSIZEOFFALDER + " the sum of the sizes of all the files in the folder");
        System.out.println("Pleaese input " + CREAT_FILE_WITH_CONTENT + "  for create File With Content");
    }
}