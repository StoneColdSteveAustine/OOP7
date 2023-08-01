package OOP7;

public interface Calculable {
    Calculable sum(int argReal, int argImaginary);

    Calculable multi(int argReal, int argImaginary);
    Calculable div (int argReal, int argImaginary);
    String getResult();
}
