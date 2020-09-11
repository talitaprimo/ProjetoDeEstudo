package projetodeestudo.usecases;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import projetodeestudo.domains.FormaPgto;
import projetodeestudo.domains.InfoPayment;
import projetodeestudo.domains.Order;
import projetodeestudo.extensions.JavaToJson;
import projetodeestudo.gateways.PaymentGateway;
import projetodeestudo.gateways.contracts.ContractPayment;
import projetodeestudo.gateways.feign.PaymentGatewayImpl;
import projetodeestudo.gateways.http.contracts.CheckoutObject;

@Service
@RequiredArgsConstructor
public class Checkout {

    private final PaymentGateway paymentGateway;

    public Order execute (CheckoutObject checkoutObject) {
       InfoPayment infoPayment = buildInfoPayment(checkoutObject);
        final ContractPayment contractPayment = paymentGateway.performPayment(infoPayment);
       contractPayment.getStatus();
        return null;
    }

    private InfoPayment buildInfoPayment(CheckoutObject checkoutObject) {
        return InfoPayment.builder()
                .enderecoCobranca(checkoutObject.getEnderecoCobranca())
                .formaPgto(checkoutObject.getFormaPgto())
                .id(checkoutObject.getId())
                .infCard(checkoutObject.getInfCard())
                .precoTotal(checkoutObject.getCart().getPrecoTotal())
                .build();
    }

    // private final JavaToJson javaToJson;

//    public Order execute (CheckoutObject checkoutObject) {
//        checkoutObject.setFormaPgto(FormaPgto.CARTAO);
//        System.out.println(javaToJson.convert(checkoutObject));
//        return null;
//    }

}


//formas de pgto
//fazer pgto
//atualizar estoque
//gerar número de pedido
//concluir a compra