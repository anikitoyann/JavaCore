package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 111, 66, 12, 30, 6, 4, 3};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        au.minOfArray(array);
        au.evenCount(array);
        au.oddCount(array);
        au.sum(array);
        au.sort1Array(array);
        au.sort2Array(array);

        char[] chars = {' ', ' ', 'j', 'a', 'v', ' ', 'a', 'l', 'o', 'v', 'e', ' ', ' '};
        au.charsCountOfo(chars);
        au.middlElem(chars);
        au.space(chars);
        au.charsSpaceExample(chars);
        au.charsCountOfo(chars);


    }
}
