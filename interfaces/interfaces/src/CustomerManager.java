public class CustomerManager { //burada iş katmanı kodları yazılır.

    //------- 1. Yöntem ---------
  /*  ICustomerDal customerDal;
    public void add(){
//        OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); //polimorphisim değil oracle sınıfına bağlı olunurbu şekilde.
        customerDal.add();
    }*/

    //------2. Yöntem --------

    private ICustomerDal customerDal; //gönderilen şeyi sadece içerde kullanmak dışarıdan erişimi engellemek için private yapılır.
    public  CustomerManager(ICustomerDal customerDal){
    //customerManagerın constructerında bir tane icustomer dal isteniyo. oracle,mysql,nosql olabilir.
    this.customerDal = customerDal;

    }

    public void add(){
        customerDal.add();
    }
}