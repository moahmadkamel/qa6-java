import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Hw4 {

    public static void main(String[] args) {
        /*
        System.out.println("--------------1---------------");
        Scanner word = new Scanner(System.in);
        System.out.println("program reads the words, to get the sentence please type 'stop' or 'STOP': ");
        System.out.print("Please Enter a word: ");
        String text = word.nextLine();
        String sentence = "";
        while (!text.equalsIgnoreCase("STOP")) {
            sentence += text.concat(" ");
            System.out.print("Please Enter a word: ");
            text = word.nextLine();
        }
        System.out.println("The sentence: " + sentence);
        word.close();
        */
        ///////////////////
        /*
        System.out.println("------------2----------------");
        String original, reverse = "";
        Scanner palindrome = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = palindrome.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
        palindrome.close();
        */
        ///////////////////////
        /*
        System.out.println("------------3----------------");
        Scanner weight = new Scanner(System.in);
        System.out.println("Weight of metal stock in the warehouse: ");
        System.out.println("Please enter the max limit of the metal weight stock in the warehouse, min = 5: ");
        int limit = weight.nextInt();
        int countOfWeight = 0;
        
        while (countOfWeight < limit) {
        
            System.out.println("How much weight of metal do you want to store, can't accept less than 5: ");
            int tempCount = weight.nextInt();
        
            if (tempCount < 5) {
                System.out.println("can't accept weight less than 5 ");
                System.out.println("free stock " + (limit - countOfWeight));
                continue;
            } else if (countOfWeight + tempCount > limit) {
                System.out.print("The limit reached. ");
                System.out.println("free stock " + (limit - countOfWeight));
                continue;
            }
        
            countOfWeight = countOfWeight + tempCount;
            System.out.println("free stock " + (limit - countOfWeight));
            if ((limit - countOfWeight) < 5 && (limit - countOfWeight) != 0) {
                System.out.println("can't accept weight less than 5");
                break;
            } else if ((limit - countOfWeight) < 5 && (limit - countOfWeight) == 0) {
                System.out.println("No more space in the warehouse");
                break;
            }
        }
        weight.close();
        */
        //////////////////////
        /*
        System.out.println("------------4-------------");
        // example 1 = 3,2,1: “Fedya will go to the shop at 14:00”
        // example 2 = 1,2,3: “Masha will go to the gym at 14:00”
        String[] array1 = new String[] { "Petya", "Masha", "Alena", "Fedya", "Sasha", "Anton", "Gleb" };
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[] { 10, 12, 14, 16, 18, 20 };
        System.out.println(Arrays.toString(array2));
        String[] array3 = new String[] { "school", "shop", "church", "gym", "cinema", "clinic" };
        System.out.println(Arrays.toString(array3));
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers which correspond to the indices of the 3 array elements: ");
        int sortArray1 = scan.nextInt();
        int sortArray2 = scan.nextInt();
        int sortArray3 = scan.nextInt();
        System.out.println(array1[sortArray1] + " will go to the " + array3[sortArray3] + " at " + array2[sortArray2] + ":00");
        
        scan.close();
        */
        
        
        ////////////////////////
        
        System.out.println("------------5-------------");
        int[] arrayEx5 = new int[10];
        Random randomEx5 = new Random();
        for (int i = 0; i < arrayEx5.length; i++) {
            arrayEx5[i] = randomEx5.nextInt(20,40);
        }
        System.out.println(Arrays.toString(arrayEx5));
        
        Scanner inputEx5 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int search = inputEx5.nextInt();
        
        boolean found = false;
        for (int i = 0; i < arrayEx5.length; i++) {
            if (arrayEx5[i] == search) {
                found = true;
                break;
            }
        }    
        if (found) {
            System.out.println(search + " is present in the array. ");
        } else {
            System.out.println(search + " is not present in the array. ");
        }
        inputEx5.close();
        
        //////////////////////
        /*
        System.out.println("-----------6------------");
        System.out.println();
        int[] arrayEx6 = new int[45];
        Random randomEx6 = new Random();
        for (int i = 0; i < arrayEx6.length; i++) {
            arrayEx6[i] = randomEx6.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(arrayEx6));
        System.out.println();
        int max = arrayEx6[0];
        int min = arrayEx6[0];
        for (int value : arrayEx6) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The max number is: " + max);
        System.out.println();
        System.out.println("The min number is: " + min);
        System.out.println();
        */
        //////////////////
        

    }
}
