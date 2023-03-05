package chapter12.chapter3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyMarker {

}
class Marker{
    @MyMarker
    public static void myMeth(){
        Marker ob=new Marker();
        try{
            Method m=ob.getClass().getMethod("myMeth");
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркерная аннотация MyMarker присутствует.");
        } catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
