import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyLambda {
   public static void main(String[] args) {
    forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> System.out.println(i*i));

    //using the arg constructor as the lambda here because it matches the signature
    //now this lambda can be used to create new RGB objects based on the args provided
    TriFunction<Integer, Integer, Integer, RGB> colorFactory = RGB::new;
    RGB green = colorFactory.apply(0, 255, 0);
    System.out.println(green);
    }

    //Function to apply consumer functional interface 
   public static <T> void forEach(List<T> list, Consumer<T> p){
        for(T t: list){
            p.accept(t);
        }
        
   }

   //functional interface with triple function
   public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}



}
