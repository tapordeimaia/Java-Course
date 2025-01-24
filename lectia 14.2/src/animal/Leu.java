package animal;

public class Leu extends Animal implements Carnivor{
    @Override
    public void manancaCarne() {
        System.out.println("Leu mananca carne");
    }

    @Override
    public int getAge() {
        return 5;
    }
}
