package dev.java.ecommerce.basketservice.client;

import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import dev.java.ecommerce.basketservice.exception.CustomErrorDecoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "platzi-store",
        url = "${basket.client.platzi}",
        configuration = CustomErrorDecoder.class
)
public interface PlatziStoreClient {

    @GetMapping("/products")
    List<PlatziProductResponse> getAllProducts();

    @GetMapping("products/{id}")
    PlatziProductResponse getProduct(@PathVariable Long id);
}
