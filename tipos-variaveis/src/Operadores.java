public class Operadores {
  public static void main(String[] args) {

    // Operador de negação
    boolean variavel = true;
    System.out.println(variavel);
    variavel = !variavel;
    System.out.println(variavel);
    System.out.println(!variavel);

    // Operadores de incremento
    int numero = 5;
    numero = numero + 2;
    System.out.println(numero);

    System.out.println(numero++);
    System.out.println(numero);
    System.out.println(++numero);

    System.out.println(numero--);
    System.out.println(numero);
    System.out.println(--numero);

    /////////////////////////////////////////////

    // Operadores Unários
    // int numero = 5;
    // System.out.println(-numero);
    // System.out.println(numero);

    // numero = -numero;
    // System.out.println(numero);

    // numero = numero * -1;
    // System.out.println(numero);

    ///////////////////////////////////////////

    // Operador de concatenação
    // String concatenacao = "?";
    // concatenacao = 1 + 1 + 1 + "1";
    // System.out.println(concatenacao);

    // concatenacao = 1 + "1" + 1 + 1;
    // System.out.println(concatenacao);

    // concatenacao = 1 + "1" + 1 + "1";
    // System.out.println(concatenacao);

    // concatenacao = "1" + 1 + 1 + 1;
    // System.out.println(concatenacao);

    // concatenacao = "1" + (1 + 1 + 1);
    // System.out.println(concatenacao);
  }
}
