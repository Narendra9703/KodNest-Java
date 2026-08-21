package track.Constructor;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
