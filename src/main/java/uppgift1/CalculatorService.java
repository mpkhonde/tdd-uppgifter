package uppgift1;

public class CalculatorService {
    private Calculator calculator = new Calculator();

    public int addNumbers(int x, int y) {
        return calculator.add(x, y);
    }
}
