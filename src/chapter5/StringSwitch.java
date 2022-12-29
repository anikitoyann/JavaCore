package chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str="two";
        switch(str){
            case"one":
                System.out.println("one");
                break;
            case"three":
                System.out.println("three");
                break;
            default:
                System.out.println("does not match");
        }
    }
}
