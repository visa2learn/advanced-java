package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static lambdas.Person.Sex.*;

public class LambdaParameters {

    public static void main(String[] args) {
        Person p1 = new Person("Bob", 25, MALE);
        Person p2 = new Person("Alice", 23, FEMALE);
        Person p3 = new Person("Tom", 40, MALE);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        // Code written in java 7 and earlier
        Comparator<Person> byAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        };
        persons.sort(byAge);
        System.out.println(persons);

        Comparator<Person> byAgeLambda = (one, two) -> Integer.compare(one.age, two.age);
        persons.sort(byAgeLambda);
        System.out.println(persons);

        Comparator<Person> byAgeLambda2 = Comparator.comparing(Person::getAge);//p -> p.getAge()
        persons.sort(byAgeLambda2);
        persons.forEach(System.out::println);//x -> System.out.println(x)
    }
}
