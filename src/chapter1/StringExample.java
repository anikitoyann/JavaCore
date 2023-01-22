package chapter1;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fullName = scanner.nextLine();

        String[]names=fullName.split(" ");
        System.out.println();
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");}
            System.out.println(fullName.contains("arm"));
        System.out.println(fullName.endsWith("hi"));

        System.out.println(fullName.length());
        System.out.println(fullName.trim());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.substring(4));


    }
}
