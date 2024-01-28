//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            IndividualCustomer biltekin = new IndividualCustomer();
            biltekin.customerNumber = "12345";

            CorporateCustomer hepsiBurada = new CorporateCustomer();
            hepsiBurada.customerNumber = "78910";

            SendikaCustomer abc = new SendikaCustomer();
            abc.customerNumber = "999999";

            CustomerManager customerManager = new CustomerManager();
            Customer[] customers =  {biltekin, abc, hepsiBurada};

            customerManager.addMultiple(customers);
//            customerManager.add(hepsiBurada);
//            customerManager.add(biltekin);
//            customerManager.add(abc);

    }
}