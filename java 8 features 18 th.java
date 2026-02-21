interface Greeting {
    void sayHello();
}

public class Test {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello Java 8");
        g.sayHello();
    }
