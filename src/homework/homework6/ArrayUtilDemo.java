package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 111, 66, 12, 30, 6, 4, 3};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        au.minOfArray(array);
        au.EvenCount(array);
        au.OddCount(array);
        au.Sum(array);
        au.Sort1Array(array);
        au.Sort2Array(array);

        char[] chars = {' ', ' ', 'j', 'a', 'v', ' ', 'a', 'l', 'o', 'v', 'e', ' ', ' '};
        au.CharsCountOfo(chars);
        au.MiddlElem(chars);
        au.Space(chars);
        au.CharsSpaceExample(chars);
        au.CharsCountOfo(chars);


    }
}
