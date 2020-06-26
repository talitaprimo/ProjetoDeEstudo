package projetodeestudo.gateways.http;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/teste")
public class Controller {
    @GetMapping("/Oi")
    public String digaOi() {
        return "Olá";
    }

    @GetMapping("/Eco/{palavra}")
    public String digaOi(@PathVariable("palavra") String nome) {
        return nome;
    }

    @GetMapping("/Eco")
    public String eco (@RequestParam (value = "nome", required = true) String nome,
                       @RequestParam (value = "endereco", required = false) String endereco,
                       @RequestParam (value = "telefone", required = true) String telefone,
                       @RequestParam (value = "receberNotificacao", required = false, defaultValue = "false") Boolean receberNotificacao) {
        return nome+" " +endereco+" "+telefone+" "+receberNotificacao;
    }

    //required = true é padrão
}
