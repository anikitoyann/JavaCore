package homework.homework9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text="]{h[ello(o[((())))))))dcsdhfbdhsvb)){{{{{{{{{{{{{{[))))))))(((o} java]";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
