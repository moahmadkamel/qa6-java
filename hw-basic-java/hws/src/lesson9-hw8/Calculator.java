
/*
4)
Create a calculator class.
Create methods in it:
summ, minus, multiply, division.
Addition, subtraction, multiplication and division respectively.
Each method takes two double values as parameters.
And displays the result of the action to the console.

The class also has a start method. Which prints a message to the console that
The calculator is running. And it prompts you to enter an action in your console.

The calculator should only accept the following types of actions:
2+4; - example of addition syntax;
5-6; - example of subtraction syntax;
25*3; - example of multiplication syntax;
34/3; - example of division syntax;

After you enter an action, the response from that action is displayed on the console.
And then a message prompting you to enter an action is displayed again.

If you enter a different syntax, the console returns the following message:
"Enter a valid action."
And then a message prompting you to enter an action is displayed again.

The program closes after entering the Stop command.
Before closing, the following message should be displayed on the console:
"The calculator is closed.
*/
import java.util.Scanner;

public class Calculator {
    // public static void main(String[] args) {
    //     System.out.println("The calculator is running...");
    //     double num1 = getNumber();
    //     double num2 = getNumber();
    //     char operation = getOperation();
    //     double result = calc(num1, num2, operation);
    //     System.out.println("Result:" + result);
    // }

    // public static double getNumber() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number:");

    //     if (sc.hasNextDouble()) {
    //         return sc.nextDouble();

    //     } else {
    //         System.out.println("Input error. Please re-enter");
    //         return getNumber();
    //     }

    // }

    // public static char getOperation() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Select symbol number:\n1 - add\n2 - subtract\n3 - multiply\n4 - divide");
    //     int operationNumber = 0;
    //     if (sc.hasNextInt()) {
    //         operationNumber = sc.nextInt();
    //     } else {
    //         System.out.println("You entered not a number! Please re-enter!");
    //         return getOperation();
    //     }
    //     switch (operationNumber) {
    //         case 1:
    //             return '+';
    //         case 2:
    //             return '-';
    //         case 3:
    //             return '*';
    //         case 4:
    //             return '/';
    //         default:
    //             System.out.println("Wrong operation! Please re-enter!");
    //             return getOperation();
    //     }
    // }

    // public static double add(double num1, double num2) {
    //     return num1+num2;
    // }

    // public static double sub(double num1, double num2) {
    //     return num1-num2;
    // }

    // public static double mul(double num1, double num2) {
    //     return num1*num2;
    // }

    // public static double div(double num1, double num2) {
    //     if(num2 != 0.0) {
    //         return num1/num2;
    //     } else {
    //         System.out.println("You can't divide by 0!");
    //         return Double.NaN;
    //     }
    // }

    // public static double calc(double num1, double num2, char operation) {
    //     switch (operation) {
    //         case '+':
    //             return add(num1, num2);
    //         case '-':
    //             return sub(num1, num2);
    //         case '*':
    //             return mul(num1, num2);
    //         case '/':
    //             return div(num1, num2);
    //         default:
    //             return Double.NaN;
    //     }
    // }

    public void summ(double first, double second) {
        double result = first + second;
        System.out.println("Answer: " + result);
    }

    public void minus(double first, double second) {
        double result = first - second;
        System.out.println("Answer: " + result);
    }

    public void multiply(double first, double second) {
        double result = first * second;
        System.out.println("Answer: " + result);
    }

    public void division(double first, double second) {
        double result = first / second;
        System.out.println("Answer: " + result);
    }

    public void start() {
        System.out.println("The calculator is running");
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            System.out.println("Insert action");
            action = scanner.nextLine();
            if (action.equalsIgnoreCase("stop")) {
                System.out.println("The calculator is closed");
                break;
            } else if (action.contains("+")) { // 1221+3131
                double first = Double.parseDouble(action.split("\\+")[0]);
                double second = Double.parseDouble(action.split("\\+")[1]);
                summ(first, second);
            } else if (action.contains("*")) {
                double first = Double.parseDouble(action.split("\\*")[0]);
                double second = Double.parseDouble(action.split("\\*")[1]);
                multiply(first, second);
            } else if (action.contains("-")) {
                double first = Double.parseDouble(action.split("\\-")[0]);
                double second = Double.parseDouble(action.split("\\-")[1]);
                minus(first, second);
            } else if (action.contains("/")) {
                double first = Double.parseDouble(action.split("\\/")[0]);
                double second = Double.parseDouble(action.split("\\/")[1]);
                division(first, second);
            } else {
                System.out.println("Insert another action:");
            }
        } while (!action.equalsIgnoreCase("stop"));
        scanner.close();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
