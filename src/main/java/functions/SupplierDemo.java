package functions;

import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier1 = () -> Math.random();
        DoubleSupplier randomSupplier2 = Math::random;

        System.out.println(randomSupplier1.get());
        System.out.println(randomSupplier2.getAsDouble());

        // Supplier with Optional
        Optional<Double> emptyOptional = Optional.empty();// EMPTY optional
        // As emptyOptional is empty, orElseGet will use the randomSupplier1 Supplier to return value
        System.out.println(emptyOptional.orElseGet(randomSupplier1));
    }
}
