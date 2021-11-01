package Test;

public class Application {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Jared");

        dog1.age = 6;
        dog1.breed = "German Shephard";
        dog1.color = "Brown";

        System.out.println(dog1.name);

        dog1.sleeping();

        Human human1 = new Human("Harold");
        System.out.println(human1.name);
        human1.sleeping();

    }
}
