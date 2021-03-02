package Les10.itmarket;

public class Demo {
    public static void main(String[] args) {

        Customer client1 = new Customer("Тест","Киев","Женский");
        Customer client2 = new Customer("Дима","Львов","Мужской");
        ElectronicOrder z1 = new ElectronicOrder("",null,"Киев","Львов",190,client1);
        ElectronicOrder z2 = new ElectronicOrder("",null,"Tokyo","Paris",90,client2);
        FurnitureOrder z3 = new FurnitureOrder("",null,"Киев","",600,client2);
        FurnitureOrder z4 = new FurnitureOrder("",null,"","",400,client2);
        System.out.println("Name "+z1.customerOwned.getName());
        z1.validateOrder();
        z1.calculatePrice();
        System.out.println("Total "+z1.totalPrice);
        System.out.println(z1.dateChipped);
        z1.confirmChipping();
        System.out.println(z1.dateChipped);

        System.out.println(" z2 ");
        z2.validateOrder();
        z2.calculatePrice();
        System.out.println("Total "+z2.totalPrice);
        System.out.println(z2.dateChipped);
        z2.confirmChipping();
        System.out.println(z2.dateChipped);

        System.out.println(" z3 ");
        z3.validateOrder();
        z3.calculatePrice();
        System.out.println("Total "+z3.totalPrice);
        System.out.println(z3.dateChipped);
        z3.confirmChipping();
        System.out.println(z3.dateChipped);


        System.out.println(" z4 ");
        z4.validateOrder();
        z4.calculatePrice();
        System.out.println("Total "+z4.totalPrice);
        System.out.println(z4.dateChipped);
        z4.confirmChipping();
        System.out.println(z4.dateChipped);


    }
}
