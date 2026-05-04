package ApCode;

public class McLaren extends Car{

    public McLaren(String madeIn, int firstYearOfProduction, String model, Double price) {
        super(madeIn, firstYearOfProduction, model, price);
    }

    @Override
    public void start(String model) {
        System.out.print("McLaren ");
        super.start(model);
    }
}
