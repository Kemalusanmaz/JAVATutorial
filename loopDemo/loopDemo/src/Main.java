public class Main {
    public static void main(String[] args) {
        // for döngüsü

        for (int i=1;i<10;i++){ //sayaç, döngünün bitiş koşulu, döngünün iterasyon koşulu,
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti.");

//        for (int i=1;i<10;i+=2){ //sayaç, döngünün bitiş koşulu, döngünün iterasyon koşulu,
//            System.out.println(i);
//        }
//        System.out.println("Tek sayılar döngüsü bitti.");
//        for (int i=0;i<10;i+=2){ //sayaç, döngünün bitiş koşulu, döngünün iterasyon koşulu,
//            System.out.println(i);
//        }
//        System.out.println("Çift sayılar döngüsü bitti.");

        //while döngüsü
        int i =1; //sayaç = başlangıç noktası
        while (i <10){ //bitiş koşulu
            System.out.println(i);
            i++; //döngünün iterasyon koşulu
        }
        System.out.println("While döngüsü bitti.");

        //Do-While döngüsü

        int j = 11
                ;
        do {        //do{} içindekileri while koşulu tamamlanana kadar uygula. Program satır satır ilerlediği için koşul uymasa bile ilk iterasyon her zaman çalışacak.
            System.out.println(j);
            j++; //döngünün iterasyon koşulu
            } while (j <10); //bitiş koşulu
        System.out.println("Do-While döngüsü bitti.");

    }
}