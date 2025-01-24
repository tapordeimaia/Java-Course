import java.util.List;

public class Animal {
    private String nume;
    private int varsta;
    private List<String> alimente;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public List<String> getAlimente() {
        return alimente;
    }

    public void setAlimente(List<String> alimente) {
        this.alimente = alimente;
    }
}
