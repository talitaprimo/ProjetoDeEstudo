package projetodeestudo.gateways.http.contracts;

import lombok.Data;
import projetodeestudo.domains.Cart;
import projetodeestudo.domains.Endereco;
import projetodeestudo.domains.FormaPgto;
import projetodeestudo.domains.InfPgto;

@Data
public class CheckoutObject {

    private String id;

    private FormaPgto formaPgto;

    private InfPgto infPgto;

    private Endereco enderecoEntrega;

    private Endereco enderecoCobranca;

    private Cart cart;


}
