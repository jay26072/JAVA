class Dog{
    String name;
    int age;

    void bark(){
        System.out.println(name+"Says woof!");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name="Buddy";
        myDog.age=3;
        myDog.bark();
    }
}