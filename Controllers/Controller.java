package Day6.Controllers;

import Day6.Class.Customers;

public class Controller {
    public static void main(String[] args) {
        Customers cus1 = new Customers();
        cus1.setCustomerId("1");
        cus1.setCustomerName("Alfreds Futterkiste");
        cus1.setContactName("Maria Anders");
        cus1.setAddress("Obere Str. 57");
        cus1.setCity("Berlin");
        cus1.setPostalCode("12209");
        cus1.setCountry("Germany");

        System.out.println(cus1.toString());
    }
}
