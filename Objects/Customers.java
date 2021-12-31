package Day6.Objects;

public class Customers {
    String customerId;
    String customerName;
    String contactName;
    String address;
    String city;
    String postalCode;
    String country;


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customers: " +
                "customerId: " + customerId +
                ", customerName: " + customerName +
                ", contactName: " + contactName +
                ", address: " + address  +
                ", city: " + city +
                ", postalCode: " + postalCode +
                ", country: " + country;
    }
}
