public class App {
    public static void main(String[] args) throws Exception {
        Animale cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Animale delfino = new Delfino();

        cane.mangia();
        passerotto.dormi();
        passerotto.vola();
        delfino.mangia();
    }
}
