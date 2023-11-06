public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 3;
        //aranacak olan sayı sayıların içinde var mı yok mu?
        boolean varMi = false;

        for (int sayi : sayilar){
            if (aranacak == sayi){
                varMi = true;
                break;
            }
        }
        mesajVer(varMi,aranacak);


    }
    public static void mesajVer(boolean varMi,int aranacak){ //parametreli metot. mesajVer
        if (varMi == true){
            System.out.println(aranacak + " sayısı dizinin içinde vardır.");
        }else
            System.out.println(aranacak + " sayısı dizinin içinde yoktur.");
    }
}