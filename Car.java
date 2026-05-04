package ApCode;

public class Car {
    protected String madeIn;
    protected int firstYearOFProduction;
    protected String model;
    protected Double price;

    public Car(String madeIn, int firstYearOFProduction, String model, Double price) {
        this.madeIn = madeIn;
        this.firstYearOFProduction = firstYearOFProduction;
        this.model = model;
        this.price = price;
    }

    public void start(String model) {
        System.out.print("model " + model + " ");
        System.out.println("Started.");
    }

    public void drive() {
        System.out.println("The car is moving.");
    }

    public void brake() {
        System.out.println("Brake's lights on");
    }

    public void stop() {
        System.out.println("The car stopped.");
    }
}
