package Animals;

public class Animal implements Erbivor {
    String name;
    Integer weight;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getWeight(){
        return weight;
    }
    public void setWeight(Integer weight){
        this.weight = weight;
    }

    @Override
    public void manancaIarba() {

    }
}
