package homeworks.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Count of o: " + count);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println("middleElement: " + chars2[(chars2.length / 2) - 1]  + "," + chars2[chars2.length / 2]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println((chars3[chars3.length - 2] == 'l') && (chars3[chars3.length - 1] == 'y'));


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}



