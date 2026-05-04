package ApCode;

public class Benz extends Car{

    public Benz(String madeIn, int firstYearOfProduction, String model, Double price) {
        super(madeIn, firstYearOfProduction, model, price);
    }

    @Override
    public void start(String model) {
        System.out.print("Benz ");
        super.start(model);
    }
}
