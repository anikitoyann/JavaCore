package chapter12.chaper1;

public class AuutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("Исходное значение iOb: " + iOb);
        ++iOb;
        System.out.println("Пocлe ++iOb: " + iOb);
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 после выражения: " + iOb2);
        i = iOb + (iOb / 3);
        System.out.println("i после выражения: " + i);
    }
}
