package Les10.itmarket;

import java.util.Date;

public abstract class Order {

    String itemName;
    Date dateCreated;
    Date dateConfirmed;
    Date dateChipped;
    String chipFromCity;
    String getChipToCity;
    int basePrice;
    double totalPrice;
    Customer customerOwned;

    abstract void validateOrder();

    abstract void calculatePrice();

    void confirmChipping() {
        if (dateChipped == null) {
            dateChipped = new Date();
        }
    }

    public Order(String itemName, Date dateCreated, String chipFromCity, String getChipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.chipFromCity = chipFromCity;
        this.getChipToCity = getChipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }


}
