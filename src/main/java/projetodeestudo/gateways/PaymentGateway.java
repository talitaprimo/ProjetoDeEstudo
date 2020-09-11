package projetodeestudo.gateways;

import projetodeestudo.domains.InfoPayment;
import projetodeestudo.gateways.contracts.ContractPayment;

public interface PaymentGateway {
    ContractPayment performPayment(final InfoPayment infoPayment);
}
