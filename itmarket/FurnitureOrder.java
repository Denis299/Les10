package Les10.itmarket;

import java.util.Date;

public class FurnitureOrder extends Order {
    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String chipFromCity, String getChipToCity, int basePrice, Customer customerOwned) {
        super(itemName, dateCreated, chipFromCity, getChipToCity, basePrice, customerOwned);
    }

    @Override
    void validateOrder() {
        if (!((chipFromCity == "Киев") || (chipFromCity == "Львов"))) {
            System.out.println("Доставка из города " + chipFromCity + " невозможна");
        }
        if (customerOwned.getName() == "Тест") {
            System.out.println("Этого клиента не обслуживаем");
        }
        if (basePrice < 500) {
            System.out.println("минимальный заказ от 500");
        }
    }

    @Override
    void calculatePrice() {
        if (basePrice >= 5000) {
            totalPrice = basePrice * 1.02;
        } else {
            totalPrice = basePrice * 1.05;
        }
    }
}
