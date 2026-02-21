import java.util.Optional;

public class OptionalAllMethodsDemo {

    public static void main(String[] args) {

        String name = "Anjali";
        String nullValue = null;

        // 1️⃣ of()  -> value must NOT be null
        Optional<String> opt1 = Optional.of(name);
        System.out.println("of(): " + opt1.get());

        // 2️⃣ ofNullable() -> value can be null
        Optional<String> opt2 = Optional.ofNullable(nullValue);
        System.out.println("ofNullable(): " + opt2);

        // 3️⃣ isPresent()
        System.out.println("isPresent(): " + opt1.isPresent());

        // 4️⃣ ifPresent()
        opt1.ifPresent(val -> System.out.println("ifPresent(): " + val));

        // 5️⃣ orElse()
        String result1 = opt2.orElse("Default Value");
        System.out.println("orElse(): " + result1);

        // 6️⃣ orElseGet()
        String result2 = opt2.orElseGet(() -> "Generated Value");
        System.out.println("orElseGet(): " + result2);

        // 7️⃣ orElseThrow()
        try {
            String result3 = opt2.orElseThrow(() -> 
                new RuntimeException("Value not found"));
            System.out.println(result3);
        } catch (Exception e) {
            System.out.println("orElseThrow(): " + e.getMessage());
        }

        // 8️⃣ map()
        Optional<Integer> length = opt1.map(String::length);
        System.out.println("map(): " + length.get());

        // 9️⃣ flatMap()
        Optional<String> optUpper =
                opt1.flatMap(val -> Optional.of(val.toUpperCase()));
        System.out.println("flatMap(): " + optUpper.get());

        // 🔟 filter()
        Optional<String> filtered =
                opt1.filter(val -> val.startsWith("A"));
        System.out.println("filter(): " + filtered.orElse("No Match"));

        // 1️⃣1️⃣ empty()
        Optional<String> emptyOpt = Optional.empty();
        System.out.println("empty(): " + emptyOpt);

        // 1️⃣2️⃣ equals()
        System.out.println("equals(): " + opt1.equals(Optional.of("Anjali")));

        // 1️⃣3️⃣ hashCode()
        System.out.println("hashCode(): " + opt1.hashCode());

        // 1️⃣4️⃣ toString()
        System.out.println("toString(): " + opt1.toString());
    }
}