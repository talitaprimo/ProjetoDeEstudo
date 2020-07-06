package projetodeestudo.gateways.http;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import projetodeestudo.domains.Product;

import java.util.List;

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

//    @GetMapping("/Produto")
//    public String getProduct(){
//
//        Product product = new Product("tênis", "123-3456-8765-098");
//        product.setPrice(250);
//        return product.toString();
//    }

    @PostMapping("/compare")
    public boolean compare(@RequestBody List<Product> products) {
        return products.get(0).equals(products.get(1));
    }

//    @GetMapping("/reference")
//    public boolean getReference(){
//
//        Product productA = new Product("tênis", "123-3456-8765-098");
//        productA.setPrice(250);
//        Product productB = new Product("tênis1", "123-3456-8765-098");
//        productB.setPrice(250);
//        return productA.equals(productB);
//
//    }

    @GetMapping("/produtoBuilder")
    public Product productBuilder() {
        return Product.builder()
                .name("sapato")
                .sku("123-321")
                .build();
    }
    //required = true é padrão
}
