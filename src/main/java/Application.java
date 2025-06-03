import campaign.Campaign;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Product.ProductBuilder  builder =  Product.builder();

        List<Product> products = new ArrayList<>();
        products.add(builder.name("T-Shirt").price(350d).category("Clothing").build());
        products.add(builder.name("Hat").price(250d).category("Clothing").build());


    }

    public Double calculateFinalPrice(List<Product> products, List<Campaign> campaigns) {
        return null;
    }
}
