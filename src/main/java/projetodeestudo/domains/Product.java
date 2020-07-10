package projetodeestudo.domains;

import com.sun.istack.internal.NotNull;
import lombok.*;
@Builder
@Getter
@EqualsAndHashCode(of = "sku")
@ToString(of={"name", "price"})
public class Product {
    @NotNull
    private final String name;
    @NotNull
    private final String sku;
    private final double price;
    @NotNull
    private final Seller seller;

}
