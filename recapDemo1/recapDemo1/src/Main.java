public class Main {
    public static void main(String[] args) {
        int sayi1 = 24;
        int sayi2 = 26;
        int sayi3 = 2;
        int enBuyuk = sayi1;
//
//        if  (sayi1>sayi2){
//            if (sayi1>sayi3){
//                System.out.println(sayi1 + " en büyük sayidir.");
//            }
//            else
//                System.out.println(sayi3 + " en büyük sayidir.");
//        } else
//            if (sayi2>sayi3){
//                System.out.println(sayi2 + " en büyük sayidir.");
//            }else
//                System.out.println(sayi3 + " en büyük sayidir.");
            if (enBuyuk<sayi2){
                enBuyuk=sayi2;
            }
            if (enBuyuk<sayi3){
                enBuyuk=sayi3;
            }
            System.out.println("En büyük = " + enBuyuk);
    }
}