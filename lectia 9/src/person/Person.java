package person;

public class Person {

    int age;

    String name;

    public Person() {

    }

    public Person(int age) {
        this(age, "Nume necunoscut");
    }

    public Person(int age,  String name) {
        this.age = age;
        this.name = name;
    }

}
