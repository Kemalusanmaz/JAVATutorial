public class Main {
    public static void main(String[] args) {
        //inheritence = iki nesne arasında miras bırakma durumu. Attribute ve fonksyionları miras alır.

        //Attribute
        Customer customer = new Customer();
        Employee employee = new Employee();
        /*customer.id
        employee.id
        iki class id değişkenini person classından miras alır.*/


        //Fonksiyon
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        /*customerManager.add();
        employeeManager.add();
        iki class arasında add fonksiyonu ortak ise ayrı bir classa alınıp bu cclasstan miras alınır.*/


    }
}