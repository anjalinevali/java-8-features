class Calculator {

    // Static method
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        // Calling static method using class name
        Calculator.add(10, 20);
    }
}