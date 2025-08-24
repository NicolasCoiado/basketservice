package dev.java.ecommerce.basketservice.controller.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BasketRequest {
    @NotNull(message = "Client id is required")
    private Long clientId;

    @Valid
    @NotNull
    private List<ProductRequest> products;
}