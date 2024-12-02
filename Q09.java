        import java.util.Scanner;
public class Q09 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                System.out.print("Enter the operator (+, -, *, /, %): ");
                char operator = scanner.next().charAt(0);
                double result;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                    case '%':
                        if (num2 == 0) {
                            System.out.println("Division by zero is not allowed.");
                        } else {
                            result = num1 % num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        break;
                }
            }
        }




