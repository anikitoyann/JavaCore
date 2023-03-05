package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();
}
class Single{
    @MySingle(100)
    public static void myMeth(){
        Single ob=new Single();
        try{
          Method m = ob.getClass().getMethod("myMeth");
            MySingle anno=m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
