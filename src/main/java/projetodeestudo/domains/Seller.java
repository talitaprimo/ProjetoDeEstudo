package projetodeestudo.domains;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@EqualsAndHashCode(of = "id")
@Document
public class Seller {

    @Id
    private String id;

    private String name;

}
