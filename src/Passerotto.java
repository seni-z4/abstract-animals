public class Passerotto extends Animale implements volano {
  @Override
  public void dormi() {
    System.out.println("Passerotto sta dormendo");
  }

  @Override
  public void verso() {
    System.out.println("pew pew");

  }

  @Override
  public void mangia() {
    System.out.println("Passerotto sta mangiando");

  }

  @Override
  public void vola() {
    System.out.println("Sto volando!!!");
  }

}
