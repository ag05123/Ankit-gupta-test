
class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "add": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide": return (b != 0) ? a / b : Double.NaN;
            default: return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 5, "divide");
        System.out.println("Result: " + calc.calculate());
    }
}
