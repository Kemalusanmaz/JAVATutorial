public class Main {
    public static void main(String[] args) {
        double[] myList2 = new double[4];
        double[] myList = {1.2,1.3,3.4,5.6}; //dizi bu şekilde de tanımlanabilir.

        double total = 0;
        double max = myList[0];

        //1) listedeki sayıları tek tek yazdır
        for (double listItems:myList){
            System.out.println("Sayı : "+listItems);
            total = total + listItems;

            if (max<listItems){
                max = listItems;
            }

        }
        //2) Sayıların toplamını yazdır.
        System.out.println("Sayıların toplamı = "+total);

        //3) Sayıların içindeki en büyük sayıyı yazdır.
        System.out.println("En büyük sayı = "+max);
    }
}