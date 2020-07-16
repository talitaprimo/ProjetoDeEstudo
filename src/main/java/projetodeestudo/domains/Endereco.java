package projetodeestudo.domains;

import lombok.Data;

@Data
public class Endereco {

    private String logradouro;
    private String numero;
    private String cep;
    private String bairro;
    private String complemento;

}
