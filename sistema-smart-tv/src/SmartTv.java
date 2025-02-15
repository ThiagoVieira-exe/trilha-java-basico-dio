public class SmartTv {

  boolean ligada = false;
  int canal = 1;
  int volume = 15;

  public void mudarCanal(int canal) {
    this.canal = canal;
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void ligarTv() {
    System.out.println("Ligando a TV!");
    ligada = true;
  }

  public void desligarTv() {
    System.out.println("Desligando a TV!");
    ligada = false;
  }
}
