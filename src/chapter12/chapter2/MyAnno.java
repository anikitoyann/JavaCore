package chapter12.chapter2;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();

    int val();
}

@Retention(value = RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация тестового метода")
@MyAnno(str = "Testing", val = 100)
class Meta2 {
    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("Bce аннотации для класса Meta2:");
            for (Annotation a : annos)
                System.out.println(a);
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Bce аннотации для метода myMeth() :");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Meтoд не найден.");
        }
    }


    public static void main(String args[]) {
        myMeth();

    }
}
