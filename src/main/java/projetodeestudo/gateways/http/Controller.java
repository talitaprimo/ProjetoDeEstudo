package projetodeestudo.gateways.http;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projetodeestudo.domains.Cart;
import projetodeestudo.domains.Product;
import projetodeestudo.domains.Seller;
import projetodeestudo.gateways.SellerGateway;
import projetodeestudo.usecases.GetCartTotal;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teste")
public class Controller {

    private final GetCartTotal getCartTotal;

    private Cart cart = new Cart();

    private final SellerGateway sellerGateway;

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

//    @PostMapping("/total")
//    public boolean total(@RequestBody List<Product> products){
//
//    }

    @PostMapping("/addProduct")
    public Cart addProduct(@RequestBody List<Product> p) {
        if(cart.getProducts() != null) {
            cart.getProducts().addAll(p);
        } else {
            cart.setProducts(p);
        }
        cart.setTotal(getCartTotal.execute(cart.getProducts()));
        return cart;
    }

    @PostMapping("/removeProduct")
    public Cart removeProduct(@RequestBody List<Product> p){
        if(cart.getProducts() != null) {
            for (Product product: p) {
                cart.getProducts().remove(product);
            }
        } else {
            cart.setProducts(new ArrayList<>());
        }
        cart.setTotal(getCartTotal.execute(cart.getProducts()));
        return cart;
    }

    @PostMapping("/saveSeller")
    public Seller saveSeller(@RequestBody Seller s){
        return sellerGateway.save(s);
    }
}
