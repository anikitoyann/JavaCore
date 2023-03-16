package chapter1;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        user.name = "Poxos";
        user.Language = Language.ENG;
        Language myLenguage = Language.ENG;
        user.Language = myLenguage;
        Language[] languages = Language.values();
        System.out.println("please choose languages");
        for (Language language : languages) {
            System.out.println(language);
        }
        String languageSTR = scanner.nextLine();
        try{
            user.Language = Language.valueOf(languageSTR);
            System.out.println("for " + user.name + " country " + user.Language.getCountry()+" selelcted "+ user.Language);
    }catch (IllegalArgumentException e){
            System.out.println("Language is wrong");}
    }
}