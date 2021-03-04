package Les10.itmarket;

import java.util.Date;

public class ElectronicOrder extends Order {
    public ElectronicOrder(String itemName, Date dateCreated, String chipFromCity, String getChipToCity, int basePrice, Customer customerOwned) {
        super(itemName, dateCreated, chipFromCity, getChipToCity, basePrice, customerOwned);
    }

    int guaranteeMonths;

    @Override
    void validateOrder() {
        if (!(city4(chipFromCity) || city4(getChipToCity))) {
            System.out.println("Валидация по городу невозможна");
        }
        if (!(customerOwned.getGender().equals("Женский"))) {
            System.out.println("Оформляем только женщинам!");
        }
        if (basePrice < 100) {
            System.out.println("Минимальный прайс заказа 100");
        }

        return;
    }

    private boolean city4(String city) {
        if ((city == "Киев") || (city == "Одесса") || (city == "Днепр") || (city == "Харьков")) {
            return true;
        }
        return false;
    }

    @Override
    void calculatePrice() {
        if ((getChipToCity == "Киев") || (getChipToCity == "Одесса")) {
            totalPrice = basePrice * 0.10 + sale(basePrice);
        } else {
            totalPrice = basePrice * 0.15 + sale(basePrice);
        }
        return;
    }

    private double sale(int sum) {
        if (sum > 1000) {
            return (sum / 1.05);
        }
        ;
        return sum;
    }
}
