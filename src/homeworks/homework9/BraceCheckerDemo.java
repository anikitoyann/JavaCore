package homeworks.homework9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text="(Hell))))))0ooo Java (((from Armenia}";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
