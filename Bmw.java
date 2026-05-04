package ApCode;

public class Bmw extends Car{

    public Bmw(String madeIn, int firstYearOfProduction, String model, Double price) {
        super(madeIn, firstYearOfProduction, model, price);
    }

    @Override
    public void start(String model) {
        System.out.print("BMW ");
        super.start(model);
    }


}
