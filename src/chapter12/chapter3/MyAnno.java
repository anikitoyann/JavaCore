package chapter12.chapter3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(value = RetentionPolicy.RUNTIME)

public @interface MyAnno {
    String str()default "Тестирование";
    int value() default 9000;
}
class Meta3{
    @MyAnno()
    public static void myMeth(){
        Meta3 ob=new Meta3();
        try{
            Class<?>c=ob.getClass();
            Method m=c.getMethod("myMeth");
            MyAnno anno=m.getAnnotation(MyAnno.class);
            System.out.println(anno.str()+" "+anno.value());
        }catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
