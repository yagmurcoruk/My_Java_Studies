public class Main {
    // bir class birden fazla interface alabilir.
    // İnterfaces new lenemez !! Referanslarını tutarlar.

    public static void main(String[] args) {
      CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
      customerManager.add();

    }
}