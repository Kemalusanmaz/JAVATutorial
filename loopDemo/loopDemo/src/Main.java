public class Main {
    public static void main(String[] args) {
        // for döngüsü

        for (int i=1;i<10;i++){ //sayaç, döngünün bitiş koşulu, döngünün iterasyon koşulu,
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        for (int i=1;i<10;i+=2){ //sayaç, döngünün bitiş koşulu, döngünün iterasyon koşulu,
            System.out.println(i);
        }
        System.out.println("Tek sayılar döngüsü bitti.");
        for (int i=0;i<10;i+=2){ //sayaç, döngünün bitiş koşulu, döngünün iterasyon koşulu,
            System.out.println(i);
        }
        System.out.println("Çift sayılar döngüsü bitti.");
    }
}