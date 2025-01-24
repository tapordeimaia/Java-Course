package animal;

public class Urs extends Animal implements Carnivor{
    @Override
    public void manancaCarne() {
        System.out.println("Ursul mananca carne");
    }

    @Override
    public int getAge() {
        return 5;
    }
}
