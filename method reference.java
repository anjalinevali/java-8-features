import java.util.function.Function;

public class StaticMethodRefExample {

    public static void main(String[] args) {

        // Lambda
        Function<String, Integer> f1 = s -> Integer.parseInt(s);

        // Method Reference
        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println(f2.apply("100"));
    }
}

import java.util.function.Consumer;

public class InstanceMethodRefExample {

    public static void main(String[] args) {

        Consumer<String> c = System.out::println;

        c.accept("Hello Method Reference");
    }
}
import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "python", "spring");

        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
import java.util.function.Supplier;

class Employee {
    Employee() {
        System.out.println("Employee Created");
    }
}

public class ConstructorRefExample {

    public static void main(String[] args) {

        Supplier<Employee> s = Employee::new;

        s.get();   // Calls constructor
    }
}