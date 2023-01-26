package homework.homework9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text="{hello( (from)} java]";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
