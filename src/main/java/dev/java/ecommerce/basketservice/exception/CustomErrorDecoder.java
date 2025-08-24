package dev.java.ecommerce.basketservice.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class CustomErrorDecoder implements ErrorDecoder {

  @Override
  public Exception decode(String methodKey, Response response) {
    String message = "";
    try (InputStream is = response.body().asInputStream();
         ByteArrayOutputStream result = new ByteArrayOutputStream()) {

      byte[] buffer = new byte[4096];
      int length;
      while ((length = is.read(buffer)) != -1) {
        result.write(buffer, 0, length);
      }
      message = result.toString(StandardCharsets.UTF_8.name());
    } catch (IOException e) {
    }

    switch (response.status()) {
      case 400:
        if (message.contains("EntityNotFoundError")) {
          return new DataNotFoundException("Product not found");
        } else {
          return new BusinessException("Bad Request: " + message);
        }
      case 404:
        return new DataNotFoundException("Product not found");
      case 422:
        return new BusinessException("Validation error while calling external API");
      default:
        return new BusinessException(
                "Unexpected error while calling external API. Status: " + response.status()
        );
    }
  }
}