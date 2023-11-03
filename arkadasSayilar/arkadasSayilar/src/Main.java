public class Main {
    public static void main(String[] args) {
        //kendiler ihariç pozitif tam bölenlerin toplamı birbirine eşit olan sayılar arkadaş sayılardır.
        //örneğin 220'nin kendi dışında bölenleri 284, 284ün kendi dışında bölenleri toplamı 220'dir.

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1;i<number1;i++){
            if (number1 % i == 0){
                total1 = total1 + i;
            }
        } System.out.println(number1 + " sayısının bölenlerinin toplamı: " +total1);
        for (int j = 1;j<number2;j++){
            if (number2 % j == 0){
                total2 = total2 + j;
            }
        } System.out.println(number2 + " sayısının bölenlerinin toplamı: " +total2);
        if (total1 == number2 && total2 == number1){
            System.out.println(number1 + " ve " + number2 + " kardeş sayılardır.");
        } else
            System.out.println(number1 + " ve " + number2 + " kardeş sayı değildir.");

    }
}