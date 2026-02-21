import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p = num -> num > 10;

        System.out.println(p.test(15)); // true
        System.out.println(p.test(5));  // false
    }
}

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> f = str -> str.length();

        System.out.println(f.apply("Java"));
    }
}

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = name -> 
            System.out.println("Hello " + name);

        c.accept("Anjali");
    }
}
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> s = () -> Math.random();

        System.out.println(s.get());
    }
}