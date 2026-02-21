public class Main {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee(1, "Ravi", "IT", 50000, 5),
            new Employee(2, "Anjali", "HR", 40000, 3),
            new Employee(3, "Kiran", "IT", 70000, 8),
            new Employee(4, "Priya", "Finance", 60000, 6),
            new Employee(5, "Amit", "HR", 45000, 4)
        );

        // 1️⃣ filter()
        list.stream()
            .filter(e -> e.getSalary() > 50000)
            .forEach(System.out::println);

        // 2️⃣ map()
        list.stream()
            .map(e -> e.getName())
            .forEach(System.out::println);

        // 3️⃣ sorted()
        list.stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .forEach(System.out::println);

        // 4️⃣ max()
        Optional<Employee> maxSalary =
            list.stream().max(Comparator.comparing(Employee::getSalary));
        maxSalary.ifPresent(System.out::println);

        // 5️⃣ min()
        list.stream()
            .min(Comparator.comparing(Employee::getSalary))
            .ifPresent(System.out::println);

        // 6️⃣ count()
        long count = list.stream()
            .filter(e -> e.getDepartment().equals("IT"))
            .count();
        System.out.println("IT Count: " + count);

        // 7️⃣ collect() - List
        List<String> names =
            list.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);

        // 8️⃣ collect() - Group By
        Map<String, List<Employee>> group =
            list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(group);

        // 9️⃣ collect() - toMap()
        Map<String, Double> nameSalary =
            list.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(nameSalary);

        // 🔟 reduce()
        double totalSalary =
            list.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println("Total Salary: " + totalSalary);

        // 1️⃣1️⃣ anyMatch()
        boolean anyHighSalary =
            list.stream().anyMatch(e -> e.getSalary() > 80000);
        System.out.println(anyHighSalary);

        // 1️⃣2️⃣ allMatch()
        boolean allAbove30k =
            list.stream().allMatch(e -> e.getSalary() > 30000);
        System.out.println(allAbove30k);

        // 1️⃣3️⃣ findFirst()
        list.stream()
            .filter(e -> e.getDepartment().equals("HR"))
            .findFirst()
            .ifPresent(System.out::println);

        // 1️⃣4️⃣ limit()
        list.stream()
            .limit(3)
            .forEach(System.out::println);

        // 1️⃣5️⃣ skip()
        list.stream()
            .skip(2)
            .forEach(System.out::println);
    }
}