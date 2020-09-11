package projetodeestudo.gateways.contracts;

import lombok.Data;
import projetodeestudo.domains.StatusPayment;

import java.time.LocalDateTime;

@Data
public class ContractPayment {

    private StatusPayment status;

    private LocalDateTime data;
}
