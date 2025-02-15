public class Operadores {
  public static void main(String[] args) {

    // operadores lógicos
    boolean condicao1 = true;
    boolean condicao2 = false;

    System.out.println(condicao1 && condicao2);
    System.out.println(condicao1 || condicao2);

    ///////////////////////////////////////////////

    // // Operadores relacionais
    // String nomeUm = "Thiago";
    // String nomeDois = new String("Thiago");
    // System.out.println(nomeUm == nomeDois);
    // System.out.println(nomeUm.equals(nomeDois));
    // // .equals() é usado para objetos ou textos

    // int numero1 = 1;
    // int numero2 = 2;

    // boolean simNao = numero1 == numero2;
    // System.out.println(simNao);

    // simNao = numero1 != numero2;
    // System.out.println(simNao);

    // simNao = numero1 > numero2;
    // System.out.println(simNao);

    // if (numero1 < numero2) {
    // System.out.println("A condição é verdadeira.");
    // }

    ////////////////////////////////////////////

    // // Operador ternário
    // int a, b;
    // a = 5;
    // b = 6;

    // String resultado = "";

    // resultado = a == b ? "Verdadeiro" : "Falso";
    // System.out.println(resultado);

    // if (a == b) {
    // resultado = "Verdadeiro";
    // } else {
    // resultado = "Falso";
    // }
    // System.out.println(resultado);

    ///////////////////////////////////////

    // // Operador de negação
    // boolean variavel = true;
    // System.out.println(variavel);
    // variavel = !variavel;
    // System.out.println(variavel);
    // System.out.println(!variavel);

    // // Operadores de incremento
    // int numero = 5;
    // numero = numero + 2;
    // System.out.println(numero);

    // System.out.println(numero++);
    // System.out.println(numero);
    // System.out.println(++numero);

    // System.out.println(numero--);
    // System.out.println(numero);
    // System.out.println(--numero);

    /////////////////////////////////////////////

    // // Operadores Unários
    // int numero = 5;
    // System.out.println(-numero);
    // System.out.println(numero);

    // numero = -numero;
    // System.out.println(numero);

    // numero = numero * -1;
    // System.out.println(numero);

    ///////////////////////////////////////////

    // // Operador de concatenação
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
