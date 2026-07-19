public class Employee {
    int id;
    String name;
    String department;
    double salary;
    int performanceRating;

    Employee(int id, String name, String department, double salary, int performanceRating) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("-----------------------------");
    }
}