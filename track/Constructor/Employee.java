package track.Constructor;

public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void details() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

}
