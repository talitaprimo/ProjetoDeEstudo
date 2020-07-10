package projetodeestudo.gateways.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import projetodeestudo.domains.Seller;

public interface SellerRepository extends MongoRepository<Seller, String> {

}
