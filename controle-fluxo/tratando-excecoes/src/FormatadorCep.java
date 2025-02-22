public class FormatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("23165064");
      System.out.println(cepFormatado);
    } catch (CepInvalidException e) {
      // e.printStackTrace();
      System.out.println("Cep inválido.");
    }
  }

  static String formatarCep(String cep) throws CepInvalidException {
    if (cep.length() != 8) {
      throw new CepInvalidException();
    }
    return "23.765-064";
  }

}
