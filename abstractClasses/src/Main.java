public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
      /*Abstract sınıflar asla new lenemezler.
      GameCalculator gameCalculator = new GameCalculator();*/
        GameCalculator[] gameCalculators = new GameCalculator[]{
                new ManGameCalculator(), new WomanGameCalculator(), new KidsGameCalculator()};

    }
}