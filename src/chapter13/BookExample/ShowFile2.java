package chapter13.BookExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe: ShowFile имя_файла");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Иcпoльзoвaниe: ShowFile имя_файла");
        } catch (IOException e) {
            System.out.println("Пpoизoшлa ошибка ввода-вывода");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Oшибкa закрытия файла");

            }
        }
    }}

