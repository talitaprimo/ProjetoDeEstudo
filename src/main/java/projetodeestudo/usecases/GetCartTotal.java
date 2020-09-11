package projetodeestudo.usecases;

import org.springframework.stereotype.Service;
import projetodeestudo.domains.Product;
import projetodeestudo.domains.Seller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class GetCartTotal {

    public double execute(List<Product> products) {
        double total = 0;

        for (Product product : products
        ) {
            total = product.getUnitPrice() + total;
        }
        for (Seller seller : getDiferentSellers(products)
        ) {
            total = getFreightBySellerId(seller.getId()) + total;
        }
        return total;
    }

    private double getFreightBySellerId(String id) {
        return 15;
    }

    private Set<Seller> getDiferentSellers(List<Product> products) {
        HashSet<Seller> sellers = new HashSet<>();

        for (Product product : products
        ) {
            sellers.add(product.getSeller());
        }
        return sellers;
    }
}
