package ApCode;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}
