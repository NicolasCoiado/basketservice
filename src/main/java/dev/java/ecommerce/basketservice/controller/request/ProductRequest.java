package dev.java.ecommerce.basketservice.controller.request;

import dev.java.ecommerce.basketservice.validation.PositiveQuantity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PositiveQuantity
public class ProductRequest {
    @NotNull
    private Long id;

    private Long quantity;
}