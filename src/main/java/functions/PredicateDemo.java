package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "New York", "Paris", "London", "San Francisco", "Spain");

        Predicate<String> nameStartsWithS = str -> str.startsWith("S");
        cities.stream()
                .filter(nameStartsWithS)
                .forEach(System.out::println);

        Predicate<String> lengthGreaterThan = str -> str.length() >= 6;
        cities.stream()
                .filter(nameStartsWithS.and(lengthGreaterThan))
                .forEach(System.out::println);
    }
}
