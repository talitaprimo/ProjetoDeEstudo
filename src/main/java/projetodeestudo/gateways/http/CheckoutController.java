package projetodeestudo.gateways.http;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetodeestudo.gateways.http.contracts.CheckoutObject;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    @PostMapping
public void checkout(@RequestBody CheckoutObject checkoutObject ){

    }
}

