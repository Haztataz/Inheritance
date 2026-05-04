package ApCode;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void bark() {
        System.out.println("Hop Hop");
    }
    public void run() {
        System.out.println(name + " is running.");
    }
}
