package chapter1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {
public void someMethod(){

}
@ExampleAnotation()
    public void myMethod() {
        System.out.println("Hello");
    }
@ExampleAnotation(str = "Poghos",val =4)
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationMain annotationMain = new AnnotationMain();
        Method[] declaredMethods = annotationMain.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("method name is:"+method.getName());
            Annotation[] annotation = method.getDeclaredAnnotations();
            for (Annotation annotations : annotation) {
                if(annotations instanceof ExampleAnotation)
                System.out.println("Our ExampleAnnotattion is present");

            }
        }
    }
}