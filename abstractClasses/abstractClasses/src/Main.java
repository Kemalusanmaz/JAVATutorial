public class Main {
    public static void main(String[] args) {
        /*WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();*/

        //GameCalculator gameCalculator = new GameCalculator() // abstract sınıflar asla new şekilde kullanılamaz
        GameCalculator[] gameCalculators = new GameCalculator[]{new KidsGameCalculator(),new ManGameCalculator(),new WomanGameCalculator(),new OlderGameCalculator()};
        for (GameCalculator gameCalculator: gameCalculators){
            gameCalculator.hesapla();
            gameCalculator.gameOver();
        }
    }
}