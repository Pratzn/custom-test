package campaign;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import product.Product;

import java.util.List;
@Builder
@Data
@AllArgsConstructor
public class Campaign {

        String name;
        Category category;
        Type type;

        public List<Product> discount(List<Product> products){
                return null;
        }

}
