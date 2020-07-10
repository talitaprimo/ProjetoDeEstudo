package projetodeestudo.gateways;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projetodeestudo.domains.Seller;
import projetodeestudo.gateways.mongo.SellerRepository;

@Component
@RequiredArgsConstructor
public class SellerGateway {
    private final SellerRepository sellerRepository;

    public Seller save(Seller seller){
        return sellerRepository.save(seller);
    }
}
