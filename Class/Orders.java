package Day6.Class;

public class Orders {
    String orderId;
    String customerId;
    String employeeId;
    String orderDate;
    String shipperId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    @Override
    public String toString() {
        return "Orders: " +
                "orderId: " + orderId +
                ", customerId: " + customerId +
                ", employeeId: " + employeeId +
                ", orderDate: " + orderDate +
                ", shipperId: " + shipperId;
    }
}
