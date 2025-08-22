package dev.java.ecommerce.basketservice.controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    private Long id;
    private Long quantity;
}