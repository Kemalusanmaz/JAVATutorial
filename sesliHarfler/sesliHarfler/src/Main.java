public class Main {
    public static void main(String[] args) {
        char karakter = 'Ü';
        //benim çözümüm
        /*if (karakter == 'A' || karakter == 'I' || karakter == 'O' || karakter == 'U'){
            System.out.println(karakter + " kalın sesli bir harftir.");
        }
        else if  (karakter == 'E' || karakter == 'İ' || karakter == 'Ö' || karakter == 'Ü'){
            System.out.println(karakter + " ince sesli bir harftir.");
        }else
            System.out.println(karakter + " sesli bir harf değildir.");*/

        // diğer çözüm
        switch (karakter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(karakter + " kalın sesli bir harftir.");
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(karakter + " ince sesli bir harftir.");
                break;
            default:
                System.out.println(karakter + " sesli bir harf değildir.");
        }
    }
}