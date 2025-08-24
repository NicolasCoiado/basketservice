package dev.java.ecommerce.basketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "dev.java.ecommerce.basketservice.client")
@EnableCaching
@SpringBootApplication
public class BasketserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasketserviceApplication.class, args);
	}

}
