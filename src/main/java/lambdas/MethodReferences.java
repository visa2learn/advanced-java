package lambdas;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("some", "random", "strings", "test");
        List<Integer> integerList = Arrays.asList(5, 1, 9, 7, 0, 3, 2);
        List<String> names = Arrays.asList("Mike", "Jacky", "Heather", "Scott");

        // object instance method
        stringList.forEach(System.out::println);// x -> System.out.println(x)

        // instance method via class name
        stringList.stream()
                .map(String::length) // x -> x.length()
                .forEach(System.out::println);

        // static method reference
        integerList.stream().reduce(Math::min);

        // constructor reference
        names.stream()
                .map(Person::new) // name -> new Person(name)
                .forEach(person -> System.out.println(person.getName()));
    }
}
