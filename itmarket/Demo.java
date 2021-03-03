package Les10.itmarket;

public class Demo {
    public static void main(String[] args) {

        Customer client1 = new Customer("Тест","Киев","Женский");
        Customer client2 = new Customer("Дима","Львов","Мужской");
        ElectronicOrder z1 = new ElectronicOrder("Заказ1",null,"Киев","Львов",190,client1);
        ElectronicOrder z2 = new ElectronicOrder("Заказ2",null,"Tokyo","Paris",90,client2);
        FurnitureOrder z3 = new FurnitureOrder("Заказ3",null,"Киев","Луцк",600,client2);
        FurnitureOrder z4 = new FurnitureOrder("Заказ4",null,"Одесса","Харьков",400,client2);
         tests(z1);
         tests(z2);
         tests(z3);
         tests(z4);
    }
 
    static void tests(Order order){
        System.out.println(order.customerOwned.getName());
        System.out.println(order.itemName);
        order.validateOrder();
        order.calculatePrice();
        System.out.println("Total "+order.totalPrice);
        System.out.println(order.dateChipped);
        order.confirmChipping();
        System.out.println(order.dateChipped);

    };
}

