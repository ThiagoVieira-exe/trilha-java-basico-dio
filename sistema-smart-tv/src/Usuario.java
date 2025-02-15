public class Usuario {
  public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();

    System.out.println("A TV está ligada? " + smartTv.ligada);
    smartTv.ligarTv();
    System.out.println("A TV está ligada? " + smartTv.ligada);

    System.out.println("Volume: " + smartTv.volume);
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume: " + smartTv.volume);

    System.out.println("Canal: " + smartTv.canal);
    smartTv.mudarCanal(25);
    System.out.println("Canal: " + smartTv.canal);
  }
}
