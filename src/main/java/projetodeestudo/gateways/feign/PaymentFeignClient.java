package projetodeestudo.gateways.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import projetodeestudo.domains.InfoPayment;
import projetodeestudo.gateways.contracts.ContractPayment;

@FeignClient(name = "payment", url = "${payment.url}")
public interface PaymentFeignClient {
    @PostMapping
    ContractPayment evaluatePayment(@RequestBody final InfoPayment infoPayment);
}
