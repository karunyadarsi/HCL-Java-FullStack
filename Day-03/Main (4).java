class Employee {

    String name;
    int empId;
    String email;
    double salary;
    String department;

    Employee(String name, int empId, String email, double salary, String department) {
        this.name = name;
        this.empId = empId;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("Raghu", 101, "raghu@gmail.com", 45000, "IT"),
            new Employee("Lasya", 102, "lasya@gmail.com", 50000, "HR"),
            new Employee("Rahul", 103, "rahul@gmail.com", 55000, "IT"),
            new Employee("Priya", 104, "priya@gmail.com", 40000, "HR"),
            new Employee("Kiran", 105, "kiran@gmail.com", 60000, "Finance"),
            new Employee("Sneha", 106, "sneha@gmail.com", 48000, "IT"),
            new Employee("Arjun", 107, "arjun@gmail.com", 52000, "HR"),
            new Employee("Divya", 108, "divya@gmail.com", 65000, "IT"),
            new Employee("Manoj", 109, "manoj@gmail.com", 42000, "Finance"),
            new Employee("Anu", 110, "anu@gmail.com", 58000, "HR"),
            new Employee("Varun", 111, "varun@gmail.com", 70000, "IT")
        };

        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }
    }
}