public class BaseLogger {
    //Diğer logger classlarının miras alacağı base logger classı oluşturulur.

    //diğer logger classları log fonksiyonunu BaseLogger classı extend yapıldığı için çağırabilir.
    public void log(String message){
        System.out.println("Default logger: " + message);
    }
}
