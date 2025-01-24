import java.util.List;

public class InventoryService {
    //Dependency Injection
    ProductService productService;
    public void addProduct(String name){
        List<String> products = productService.getProductName();
        products.add(name);
    }
}
