package Les10.polyexample;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
        run(human);
        User user = new User("Jack");
        run(user);
    }

    private static void run(Human human) {
        human.run();
    }
}
