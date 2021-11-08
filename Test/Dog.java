package Test;
public class Dog {
    
    //fields
    int age;
    String breed;
    String color;
    String name;



    //methods
    public Dog(String name) {
        super();
        this.name = name;
    }

    void sleeping() {
        System.out.println("Dog is Sleeping");
    }

    void eat() {
        System.out.println("Dog is Eating");
    }

}
