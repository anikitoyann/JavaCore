package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.SortedMap;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();

    int val();
}

class Meta {
    @MyAnno(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
