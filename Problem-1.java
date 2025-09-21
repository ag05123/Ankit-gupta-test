// Problem-1
// Calculator class performing Addition, Subtraction, Multiplication, Division

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
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(10, 5, "add");
        System.out.println("Addition: " + calc1.calculate());

        Calculator calc2 = new Calculator(10, 5, "divide");
        System.out.println("Division: " + calc2.calculate());
    }
}
