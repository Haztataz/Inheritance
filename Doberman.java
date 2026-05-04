package ApCode;

public class Doberman extends Dog {
    protected double maxSpeed;

    public Doberman(String name, int age, double maxSpeed) {
        super(name, age);
        this.maxSpeed = maxSpeed;
    }

    public void soundOfDoberman() {
        super.bark();
        System.out.println("Ooo");
    }

    @Override
    public void run() {
        super.run();
        System.out.println(name + " can run at a maximum speed of " + maxSpeed + " km/h");
    }

    public void myDobermanInfo() {
        System.out.println("My doberman's name is: " + name);
        System.out.println("It's age is: " + age);
        System.out.println("It's maximum speed is: " + maxSpeed + "km/h");
    }

}

