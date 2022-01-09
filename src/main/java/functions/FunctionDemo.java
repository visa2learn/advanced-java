package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "New York", "Paris", "London", "San Francisco", "Spain");

        // using traditional anonymous inner class
        List<Integer> cityNameLengths = cities.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String c) {
                        return c.length();
                    }
                })
                .collect(Collectors.toList());
        System.out.println(cityNameLengths);

        // using lambda expression
        cityNameLengths = cities.stream()
                .map(c -> c.length())
                .collect(Collectors.toList());
        System.out.println(cityNameLengths);

        // using method reference
        cityNameLengths = cities.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(cityNameLengths);
    }
}
