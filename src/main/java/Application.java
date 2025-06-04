import campaign.Campaign;
import campaign.Category;
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

    public void validateCampaign(List<Campaign> campaigns){
        if(campaigns.isEmpty()){
            return;
        }
        Category temp = campaigns.get(0).getCategory();
        for(Campaign campaign:campaigns){
           if(!temp.equals(campaign.getCategory())){
               throw new IllegalArgumentException("Campaigns must belong to the same category");
           }
        }
    }
}
