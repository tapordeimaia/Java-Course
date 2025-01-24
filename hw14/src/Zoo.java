import java.util.List;

public class Zoo {
    private List<Animal> animals;
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }
}
