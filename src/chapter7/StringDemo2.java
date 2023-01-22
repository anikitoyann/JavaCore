package chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strob1 = "Первая строка";
        String strob2 = "Вторая строка";
        String strob3 = strob1;
        System.out.println(strob3.length());
        System.out.println(strob2.charAt(3));
        if (strob1.equals(strob2)) {
            System.out.println("strob1=strob2");
        } else {
            System.out.println("strob3=strob1");
        }
    }
}
