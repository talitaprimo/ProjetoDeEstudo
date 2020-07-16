package projetodeestudo.domains;

import lombok.Data;

@Data
public class InfPgto {

    private String numCartao;
    private String dataExp;
    private String codVerif;
    private String nomeTitular;

}
