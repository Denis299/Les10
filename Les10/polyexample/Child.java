package Les10.polyexample;

public class Child extends Human{
    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Child class called ...");
        super.run();
    }
}
