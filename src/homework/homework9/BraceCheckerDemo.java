package homework.homework9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text="{Hellooo] )J{a{va [ from Arme]nia)";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
