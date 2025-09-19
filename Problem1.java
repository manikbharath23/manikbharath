import java.util.Scanner;
class Calculator {
    double a, b;
    String operation;
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("cannot divide by zero!");
                    return 0;
                }
            default:
                System.out.println("invalid operation");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        double a = sc.nextDouble();
        System.out.println("enter second number:");
        double b = sc.nextDouble();
        System.out.println("enter operation (add, subtract, multiply, divide):");
        String op = sc.next();
        Calculator calc = new Calculator(a, b, op);
        System.out.println("Result: " + calc.calculate());
        sc.close();
    }
}
