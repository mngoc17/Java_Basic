package Day6.Controllers;

import Day6.Class.Customers;
import Day6.Class.Orders;
import Day6.Class.Categories;
import Day6.Class.OrderDetails;
import Day6.Class.Employees;
import Day6.Class.Products;
import Day6.Class.Shippers;
import Day6.Class.Suppliers;

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

        Categories cate1 = new Categories();
        cate1.setCategoryId("1");
        cate1.setCategoryName("Beverages");
        cate1.setDescription("Soft drinks, coffees, teas, beers, and ales");

        System.out.println(cate1.toString());

        Employees employ1 = new Employees();
        employ1.setEmployeeId("1");
        employ1.setLastName("Davolio");
        employ1.setFirstName("Nancy");
        employ1.setBirthDate("1968-12-08");
        employ1.setPhoto("EmpID1.pic");
        employ1.setNotes("Education includes a BA in psychology from Colorado State University. She also completed " +
                "(The Art of the Cold Call). Nancy is a member of 'Toastmasters International'.");

        System.out.println(employ1.toString());

        OrderDetails orderDetail1 = new OrderDetails();
        orderDetail1.setOrderDetailId("1");
        orderDetail1.setOrderId("10248");
        orderDetail1.setProductId("11");
        orderDetail1.setQuantity("12");

        System.out.println(orderDetail1.toString());

        Orders or1 = new Orders();
        or1.setOrderId("10248");
        or1.setCustomerId("90");
        or1.setEmployeeId("5");
        or1.setOrderDate("1996-07-04");
        or1.setShipperId("3");

        System.out.println(or1.toString());

        Products pro1 = new Products();
        pro1.setProductId("1");
        pro1.setProductName("Chais");
        pro1.setSupplierId("1");
        pro1.setCategoryId("1");
        pro1.setUnit("10 boxes x 20 bags");
        pro1.setPrice("18");

        System.out.println(pro1.toString());

        Shippers ship1 = new Shippers();
        ship1.setShipperId("1");
        ship1.setShipperName("Speedy Express");
        ship1.setPhone("(503) 555-9831");

        System.out.println(ship1.toString());

        Suppliers sup1 = new Suppliers();
        sup1.setSupplierId("1");
        sup1.setSupplierName("Exotic Liquid");
        sup1.setContactName("Charlotte Cooper");
        sup1.setAddress("49 Gilbert St.");
        sup1.setCity("Londona");
        sup1.setPostalCode("EC1 4SD");
        sup1.setCountry("UK");
        sup1.setPhone("(171) 555-2222");

        System.out.println(sup1.toString());
    }
}
