package projetodeestudo.gateways.http.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mongodb.lang.Nullable;
import lombok.Data;
import projetodeestudo.domains.Cart;
import projetodeestudo.domains.Endereco;
import projetodeestudo.domains.FormaPgto;
import projetodeestudo.domains.InfCard;

@Data
public class CheckoutObject {

    private String id;

    private FormaPgto formaPgto;

    @JsonProperty(required = false)
    private InfCard infCard;

    private Endereco enderecoEntrega;

    private Endereco enderecoCobranca;

    private Cart cart;


}
