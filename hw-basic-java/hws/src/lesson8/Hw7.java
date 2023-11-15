import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class Hw7 {
    public void arrayOut(int[] array) {
        String evenString = "";
        String oddString = "";
        List<Integer> evenArrayList = new ArrayList<>();
        List<Integer> oddArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArrayList.add(array[i]);
                evenString = evenString + array[i] + " ";
            } else {
                oddArrayList.add(array[i]);
                oddString = oddString + array[i] + " ";
            }
        }
        System.out.println("Array Even numbers from an array: " + evenArrayList);
        System.out.println("Array Odd numbers from an array: " + oddArrayList);

        System.out.println("String Even numbers from an array: " + evenString);
        System.out.println("String Odd numbers from an array: " + oddString);
    }
    ///////////2//////////////
    public void doSmth() {
        System.out.println("I am empty method");
    }
    
    public void doSmth(String text) {
        System.out.println("I am method with text: " + text);
    }

    public void doSmth(String[] strArray) {
        String joinedString = String.join(" ", strArray);
        System.out.println("String array to String = " + joinedString);
    }

    public int doSmth(int[] intArray) {
        int sum = 0;
        // for (int i = 0; i < intArray.length; i++) {
        //     sum += intArray[i];
        // }
        for (int num : intArray) {
            sum += num;
        }
        return sum;
    }

    public void doSmth(String txt, int number) {
        System.out.println("Your message is " + txt + ", " + "your number is " + number);
    }

    /////////////3///////////////

    public String firstName;
    public String fatherName;
    public String familyName;
    // public String nameOfStudent;
    public String subject;
    public int numberOfPages;
    public int year;
    public String coverColor;
    public String institution;
    

    public void getInfo() {
        System.out.println(
                "FirstName: " + firstName + ", " + "FatherName: " + fatherName + ", " + "FamilyName: " + familyName);
        // System.out.println("Full name: " + nameOfStudent);
        System.out.println("Subject: " + subject);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Year: " + year);
        System.out.println("Cover color: " + coverColor);
        System.out.println("Institution: " + institution);
    }

    ///////////////////////

    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 2, 5, 235, 232423, 54, 3, 234, 212, 245, 23 };
        new Hw7().arrayOut(array);

        System.out.println("------------2-------------");
        new Hw7().doSmth();
        System.out.println("===========");
        new Hw7().doSmth("Hello");
        System.out.println("===========");

        String[] strArray = { "Converted", "using", "Java", "Streams" };
        new Hw7().doSmth(strArray);

        System.out.println("===========");

        int[] intArray = { 1, 5, 10, 25 };
        System.out.println("The sum is: " + new Hw7().doSmth(intArray));

        System.out.println("===========");
        new Hw7().doSmth("Java", 100);
        
        System.out.println("------------3-------------");

        Hw7 student = new Hw7();
        // student.nameOfStudent = "mo ahmad kamel";
        student.firstName = "Mo";
        student.fatherName = "Grogu";
        student.familyName = "Yoda";
        student.subject = "math";
        student.numberOfPages = 200;
        student.year = 2023;
        student.coverColor = "green";
        student.institution = "danit";
        
        student.getInfo();

    }
    
}
