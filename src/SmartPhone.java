
import java.util.ArrayList;

/*
 * Participant: ConcreteProduct
 */

public class SmartPhone implements Product {
    
    private final ArrayList<Product> parts;
    
    public SmartPhone() {
        parts = new ArrayList<>();
    }
    
    public void add(Product p) {
        parts.add(p);
    }
    
    @Override
    public String getSpecification() {
        String r = "SmartPhone: ";
        for (Product p: parts) {
            r += p.getSpecification() + " | ";
        }
        return r;
    }
    
}
