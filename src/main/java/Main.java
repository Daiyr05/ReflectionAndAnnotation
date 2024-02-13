import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat();

        for(Method method : myCat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(VeryImportant.class)){
                VeryImportant veryImportant = method.getAnnotation(VeryImportant.class);
                for(int i =0; i < veryImportant.times(); i++) {
                    method.invoke(myCat);
                }
            }else{
                System.out.println("There is no annotation");
            }
        }
    }
}
