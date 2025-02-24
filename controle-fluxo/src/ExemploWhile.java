import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
  public static void main(String[] args) {
    double mesada = 50.0;

    while (mesada > 0) {
      Double valorDoce = valorAleatorio();
      if (valorDoce > mesada) {
        valorDoce = mesada;
      }

      System.out.println("Doce de valor: " + valorDoce + " Adicionado no carrinho.");
      mesada -= valorDoce;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gatou toda sua mesada em doces.");

  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
    // Retorna um valor aleatório entre 2 e 8.
  }
}
