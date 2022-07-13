package chapter12.classwork.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        AnnotationExample example = new AnnotationExample();
        Class<?> aClass = example.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods(); /* for this line we can write

        Method[] declaredMethods = AnnotationExample.class.getDeclaredMethods();

        but past 2 lines -- >
        Class<?> aClass = example.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();

          we need to comment to avoid the error
         */

        for (Method declaredMethod : declaredMethods) {
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof MyAnno) {
                    MyAnno myAnno = (MyAnno) declaredAnnotation;
                    System.out.println(myAnno.str());
                }
            }
        }
    }
}
