package chapter13.BookExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("\"Heвoзмoжнo открыть файл");
            return;
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Oшибкa закрытия файла");
        }
    }
}
