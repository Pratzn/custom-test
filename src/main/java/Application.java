import campaign.Campaign;
import campaign.Category;
import campaign.Type;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Campaign.CampaignBuilder campaignBuilder = Campaign.builder();
        Product.ProductBuilder  builder =  Product.builder();

        Campaign fixedAmt = campaignBuilder.name("fixedAmt").type(Type.Fixed).category(Category.Coupon).build();
        Campaign percentDisc = campaignBuilder.name("percentDisc").type(Type.Percentage).category(Category.Coupon).build();
        Campaign percentDiscByCategory = campaignBuilder.name("percentDiscByCategory").type(Type.Percentage).category(Category.OnTop).build();
        Campaign pointsDisc = campaignBuilder.name("pointsDisc").type(Type.Fixed).category(Category.OnTop).build();
        Campaign specialCampaigns = campaignBuilder.name("specialCampaigns").type(Type.Fixed).category(Category.Seasonal).build();

        List<Campaign> campaigns = List.of(fixedAmt,percentDisc,percentDiscByCategory,pointsDisc,specialCampaigns);

        Product tShirt=builder.name("T-Shirt").price(350d).category("Clothing").build();
        Product hat = builder.name("Hat").price(250d).category("Clothing").build();
        Product hoodie = builder.name("Hoodie").price(700d).category("Clothing").build();
        Product watch = builder.name("Watch").price(850d).category("Clothing").build();
        Product bag = builder.name("Bag").price(640d).category("Clothing").build();
        Product belt = builder.name("Belt").price(230d).category("Clothing").build();



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
