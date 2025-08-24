package dev.java.ecommerce.basketservice.validation;

import dev.java.ecommerce.basketservice.controller.request.ProductRequest;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PositiveQuantityValidator implements ConstraintValidator<PositiveQuantity, ProductRequest> {

    @Override
    public boolean isValid(ProductRequest value, ConstraintValidatorContext context) {
        if (value == null) return true;
        if (value.getQuantity() == null || value.getQuantity() > 0) return true;

        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(
                "The product " + value.getId() + " must have a positive quantity."
        ).addPropertyNode("quantity").addConstraintViolation();

        return false;
    }
}