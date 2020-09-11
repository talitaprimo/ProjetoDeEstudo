package projetodeestudo.domains;

import lombok.Data;

@Data
public class InfCard {

    private String numCartao;
    private String dataExp;
    private String codVerif;
    private String nomeTitular;

}
