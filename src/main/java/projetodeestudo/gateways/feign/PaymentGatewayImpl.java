package projetodeestudo.gateways.feign;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projetodeestudo.domains.InfoPayment;
import projetodeestudo.gateways.PaymentGateway;
import projetodeestudo.gateways.contracts.ContractPayment;

@Component
@RequiredArgsConstructor
public class PaymentGatewayImpl implements PaymentGateway {

    private final PaymentFeignClient paymentFeignClient;

    @Override
    public ContractPayment performPayment(InfoPayment infoPayment) {
        return paymentFeignClient.evaluatePayment(infoPayment);
    }
}
