package projetodeestudo.extensions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projetodeestudo.domains.Cart;
import projetodeestudo.gateways.http.contracts.CheckoutObject;

@RequiredArgsConstructor
@Component
public class JavaToJson {
    private final ObjectMapper mapper;

//    public static void main(String[] args) {
//        ObjectMapper mapper = new ObjectMapper();
//        JavaToJson javaToJson = new JavaToJson(mapper);
//        CheckoutObject checkoutObject = new CheckoutObject();
//        checkoutObject.setId("125");
//        checkoutObject.setCart(new Cart());
//        System.out.println(javaToJson.convert(checkoutObject));
//    }

    public String convert(Object classe) {
        try {
            return mapper.writeValueAsString(classe);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
