package projetodeestudo.gateways.http;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetodeestudo.domains.Order;
import projetodeestudo.gateways.http.contracts.CheckoutObject;
import projetodeestudo.usecases.Checkout;
import projetodeestudo.usecases.GetCartTotal;

@RequiredArgsConstructor
@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    private final Checkout checkout;

    private final GetCartTotal getCartTotal;

    @PostMapping
    public Order checkout(@RequestBody CheckoutObject checkoutObject) {
        return checkout.execute(checkoutObject);
    }

}

//usuário, cart,
//forma de pgto e endereco entrega

//retorna inform. checkout (cód pedido)
//receber cart no body
// storeID no header
//uuid

//collection produto, infoCliente
