public class Aquila extends Animale implements volano {
  @Override
  public void dormi() {
    System.out.println("Aquila sta dormendo");
  }

  @Override
  public void verso() {
    System.out.println("fleww ");

  }

  @Override
  public void mangia() {
    System.out.println("Aquila sta mangiando");

  }

  @Override
  public void vola() {
    System.out.println("Sto volando!!!");
  }
}
