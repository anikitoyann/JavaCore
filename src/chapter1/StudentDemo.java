package chapter1;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input student's Name");
        String name=scanner.nextLine();
        System.out.println("Please input student's phoneNumber");
        String phoneNumber= scanner.nextLine();
        Student student=new Student("Poxos","077556677");

        System.out.println("Student resgistred");

    }
}
