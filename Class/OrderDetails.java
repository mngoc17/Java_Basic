package Day6.Class;

public class OrderDetails {
    String orderDetailId;
    String orderId;
    String productId;
    String quantity;

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetails: " +
                "orderDetailId: " + orderDetailId +
                ", orderId: " + orderId +
                ", productId: " + productId +
                ", quantity: " + quantity;
    }
}
