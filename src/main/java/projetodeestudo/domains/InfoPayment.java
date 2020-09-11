package projetodeestudo.domains;

import com.mongodb.lang.Nullable;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class InfoPayment {

    private FormaPgto formaPgto;

    private InfCard infCard;

    private double precoTotal;

    private Endereco enderecoCobranca;

    private String id;
}
