package OOP7;


public class  {
    public static void main(String[] args) {
        TheCalculableFactory calculableFactory = new CalculableFactory();
        CalculatorView view = new CalculatorView(calculableFactory);

        view.start();

    }
}
