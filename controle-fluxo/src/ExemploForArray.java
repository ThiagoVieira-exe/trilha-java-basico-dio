public class ExemploForArray {
  public static void main(String[] args) {

    String alunos[] = { "Felipe", "Jonas", "Julia", "Amanda" };

    // for (int i = 0; i < alunos.length; i++) {
    // System.out.printf("O aluno no indice %d é %s\n", i, alunos[i]);
    // }

    // For / Each
    for (String aluno : alunos) {
      System.out.println("Nome do aluno(a): " + aluno);
    }

  }
}
