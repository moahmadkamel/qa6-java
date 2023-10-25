
public class Hw2 {
    public static void main(String[] args) {
        String str1 = "This line that i want to cut, cause it is too long";
        System.out.println("str1 = " + str1 + ". length = " + str1.length());
        // This line that i want to cut, cause it is too long
        String str2 = str1.substring(0, str1.length() - 15);
        // This line that i want to cut, cause
        System.out.println("str2 = " + str2 + ". length = " + str2.length());
        String str3 = str2.replace(" i ", " don't ").concat(" it is perfect");
        // This line that don't want to cut, cause it is perfect
        System.out.println("str3 = " + str3 + ". length = " + str3.length());
        ///////////////////////

        System.out.println("-----------------------------");
        String jobString = "Testing, is my favorite job";
        String[] arrayOfStrings = jobString.split("\\s");

        String wordString1 = arrayOfStrings[0].replace(",", "");
        int wordLength1 = wordString1.length();
        System.out.println("word1 = ( " + wordString1 + " )" + ", length of this word = ( " + wordLength1 + " )");

        String wordString2 = arrayOfStrings[1];
        int wordLength2 = wordString2.length();
        System.out.println("word2 = ( " + wordString2 + " )" + ", length of this word = ( " + wordLength2 + " )");

        String wordString3 = arrayOfStrings[2];
        int wordLength3 = wordString3.length();
        System.out.println("word3 = ( " + wordString3 + " )" + ", length of this word = ( " + wordLength3 + " )");

        String wordString4 = arrayOfStrings[3];
        int wordLength4 = wordString4.length();
        System.out.println("word4 = ( " + wordString4 + " )" + ", length of this word = ( " + wordLength4 + " )");

        String wordString5 = arrayOfStrings[4];
        int wordLength5 = wordString5.length();
        System.out.println("word5 = ( " + wordString5 + " )" + ", length of this word = ( " + wordLength5 + " )");

        if (wordLength1 > wordLength2 && wordLength1 > wordLength3 && wordLength1 > wordLength4
                && wordLength1 > wordLength5) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        /////////////////////////

        System.out.println("--------------------------");
        String in = new String("STAR WARS: The Rise of SKywalker");
        String[] splitSentence = in.split("[Aa]");
        int countChar = splitSentence.length - 1;
        System.out.println("Number of occurrences of character 'A' & 'a' : " + countChar);

        // String someString = new String("STAR WARS: The Rise of SKywalker");
        // int count = 0;
        // for (int i = 0; i < someString.length(); i++) {
        // if (someString.charAt(i) == 'a' || someString.charAt(i) == 'A') {
        // count++;
        // }
        // }
        // System.out.println("Number of occurrences of character 'a' & 'A' : " +
        // count);
    }
}
