package dev.java.ecommerce.basketservice.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PositiveQuantityValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PositiveQuantity {
    String message() default "The quantity of the product must be positive.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
