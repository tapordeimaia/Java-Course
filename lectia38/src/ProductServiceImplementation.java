import java.util.List;

public class ProductServiceImplementation implements ProductService{
    private List<String> products;
    public List<String> getProductName(){
        return products;
    }
}
