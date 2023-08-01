package OOP7;

public class CalculableFactory implements TheCalculableFactory {
    public Calculable create(int argReal, int argImaginary) {
        return new Calculator(argReal, argImaginary);
    }
}
