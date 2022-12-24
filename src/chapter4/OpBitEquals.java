package chapter4;

public class OpBitEquals {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        a|=4;
        b>>=1;
        c<<=1;
        a^=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
