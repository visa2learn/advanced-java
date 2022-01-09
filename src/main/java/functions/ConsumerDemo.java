package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class ConsumerDemo {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Some", "random", "list", "of", "strings", "for", "demo");

        // using traditional anonymous inner class
        strList.forEach(new Consumer<String>() {
            @Override
            public void accept(String item) {
                System.out.println(item);
            }
        });

        // using lambda
        strList.forEach(item -> System.out.println(item));

        // method reference
        strList.forEach(System.out::println);

        Consumer<String> println = System.out::println;
        strList.forEach(println);

        // Another example of IntConsumer, a primitive type specialization of Consumer for int.
        IntStream.of(7, 1, 0, 9, 4, 3, 8).forEach(new IntConsumer() {
            @Override
            public void accept(int i) {
                System.out.println(i);
            }
        });

        // using lambda
        IntStream.of(7, 1, 0, 9, 4, 3, 8).forEach(i -> System.out.println(i));

        // method reference
        IntStream.of(7, 1, 0, 9, 4, 3, 8).forEach(System.out::println);
    }
}
