package person;

public class Copil extends Person {

    int age;

    public void afisareVarsta() {
        System.out.println("Age copil: " + this.age);
        System.out.println("Age parinte: " + super.age);

    }

}