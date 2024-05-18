public class ParametrosInvalidosException extends RuntimeException {
    ParametrosInvalidosException() {
      super("O segundo parmetro deve ser maior que o primeiro.");
    }
  }

