package projetodeestudo.domains;

import lombok.Data;

import java.util.List;

@Data
public class Cart {

    private List<Product> products;

    private double frete;

    private double precoTotal;

    private double total;

}
