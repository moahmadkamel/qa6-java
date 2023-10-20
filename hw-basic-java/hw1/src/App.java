public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("section 2 point 4");
        int num1 = 7;
        int num2 = 9;

        // first method
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;
        // System.out.println("num1 = " + num1 + " and num2 = " + num2);

        // second method
        num2 = num1 + num2 - (num1 = num2);
        System.out.println("num1 = " + num1 + " and num2 = " + num2);
    }
}
