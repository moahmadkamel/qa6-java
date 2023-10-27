
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        /*
        System.out.println("-------------1---------------");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please insert, "I test great. What else do you need?"");
        String text1 = scan.next();
        System.out.println("text1 = " + text1);
        String text2 = scan.next();
        System.out.println("text2 = " + text2);
        String text3 = scan.next();
        System.out.println("text3 = " + text3.replace(".", ""));
        String text4 = scan.next();
        System.out.println("text4 = " + text4.concat(" else do you need?"));
        scan.close();
        */
        /////////////////////////////////////////
        /*
        System.out.println("--------------2---------------");
        Scanner triangle = new Scanner(System.in);

        System.out.println("Please insert, three integer values to construct a triangle: ");

        System.out.println("Please insert, a = ");
        int a = triangle.nextInt();
        System.out.println("Please insert, b = ");
        int b = triangle.nextInt();
        System.out.println("Please insert, c = ");
        int c = triangle.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(a + ", " + b + ", " + c + " makes a triangle");
        } else {
            System.out.println(a + ", " + b + ", " + c + " invalid triangle");
        }
        triangle.close();
        */
        ////////////////////////////////////
        /*
        System.out.println("----------------3-------------------");
        Scanner subtraction = new Scanner(System.in);

        System.out.println("Please insert, two numbers to get the subtraction of smaller from the larger: ");

        System.out.println("Enter first num: ");
        int first = subtraction.nextInt();
        System.out.println("Enter second num: ");
        int second = subtraction.nextInt();
        int subtract = (first > second) ? first - second : second - first;
        System.out.println("Result subtraction of smaller from the larger is: " + subtract);
        subtraction.close();
        */
        ///////////////////////
        /*
        System.out.println("----------------4-------------------");
        Scanner week = new Scanner(System.in);
        System.out.println("Insert a number to get the day of the week: ");
        int weekDay = week.nextInt();

        if (weekDay == 1) {
            System.out.println("Monday");
        } else if (weekDay == 2) {
            System.out.println("Tuesday");
        } else if (weekDay == 3) {
            System.out.println("Wednesday");
        } else if (weekDay == 4) {
            System.out.println("Thursday");
        } else if (weekDay == 5) {
            System.out.println("Friday");
        } else if (weekDay == 6) {
            System.out.println("Saturday");
        } else if (weekDay == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("It would be better if today were Friday");
        }
        week.close();
        */
        /////////////////////////////
        /*
        System.out.println("----------------5-----------------");
        Scanner calc = new Scanner(System.in);
        int fnum, snum, result;
        char sign;
        System.out.println("Please Enter, two numbers and sign ( - + % / * ) to get the result:");

        System.out.println("Please Enter your first digit: ");
        fnum = calc.nextInt();
        System.out.println("Enter the second digit: ");
        snum = calc.nextInt();
        System.out.println("Enter operator ( - + % / * ): ");
        sign = calc.next().charAt(0);
        result = (sign == '+') ? (fnum + snum)
                : (sign == '-') ? (fnum - snum)
                        : (sign == '*') ? (fnum * snum)
                                : (sign == '/') ? (fnum / snum) : (sign == '%') ? (fnum % snum) : 0;
        System.out.println("Result of calc: " + result);
        calc.close();
        */
        //////////////////////////////
        /*
        System.out.println("-------------------6---------------------");
        Scanner question = new Scanner(System.in);
        System.out.println("a link to download the program");
        System.out.println("what program are you interested in ( IntelliJ IDEA, Git, Java ) ?");
        String program = question.nextLine();

        switch (program.toLowerCase()) {

            case ("intellij idea"):
                System.out.println("what OS are you using ( Linux, macOS, Windows ) ?");
                String os1 = question.nextLine();
                switch (os1.toLowerCase()) {
                    case ("linux"):
                        System.out.println("link to download the IntelliJ IDEA program on LinuxOS");
                        break;
                    case ("macos"):
                        System.out.println("link to download the IntelliJ IDEA program on macOS");
                        break;
                    case ("windows"):
                        System.out.println("link to download the IntelliJ IDEA program on WindowsOS");
                        break;
                    default:
                        System.out.println("such an OS doesn't exist.");
                }
                break;
            case ("git"):
                System.out.println("what OS are you using ( Linux, macOS, Windows) ?");
                String os2 = question.nextLine();
                switch (os2.toLowerCase()) {
                    case ("linux"):
                        System.out.println("link to download Git program on LinuxOS");
                        break;
                    case ("macos"):
                        System.out.println("link to download Git program on macOS");
                        break;
                    case ("windows"):
                        System.out.println("link to download Git program on WindowsOS");
                        break;
                    default:
                        System.out.println("such an OS doesn't exist.");
                }
                break;
            case ("java"):
                System.out.println("what OS are you using ( Linux, macOS, Windows) ?");
                String os3 = question.nextLine();
                switch (os3.toLowerCase()) {
                    case ("linux"):
                        System.out.println("link to download Java program on LinuxOS");
                        break;
                    case ("macos"):
                        System.out.println("link to download Java program on macOS");
                        break;
                    case ("windows"):
                        System.out.println("link to download Java program on WindowsOS");
                        break;
                    default:
                        System.out.println("such an OS doesn't exist.");
                }
                break;

            default:
                System.out.println("such a program doesn't exist.");

                question.close();
        }
        */
    }
}
