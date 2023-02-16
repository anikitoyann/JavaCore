package chapter1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
    static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
     SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
      Date date=new Date();
        System.out.println("plesae input data(14-02-23");
     String dayOfBirthday="23-03-94";

        Date parse=sdf.parse(dayOfBirthday);
    }
}
