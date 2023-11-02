public class Main {
    public static void main(String[] args) {
     char grade = 'F';

     switch (grade){
         case 'A':
             System.out.println("Mükemmel : Geçtiniz");
             break;
         case 'B': //iki case'in çıktısı aynı ise bu şekilde yapılır.
         case 'C':
             System.out.println("Güzel : Geçtiniz");
             break;
         case 'D':
             System.out.println("Fena Değil : Geçtiniz");
             break;
         case 'F':
             System.out.println("Kötü : Kaldınız");
             break;
         default:
             System.out.println("Geçersiz not girdiniz.");
     }
    }
}