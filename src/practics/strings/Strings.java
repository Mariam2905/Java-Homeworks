package practics.strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Strings {

    /**
     * Given a string, write a method which returns sum of all digits in that string.
     * Assume that string contains only single digits.
     */
    int sumOfAllDigitsString() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);
        return sum;
    }

    /**
     * Given a string, write a method that returns new string in which every odd
     * letter of the word is uppercase.
     * String may consist of one or more words.
     *
     * @param line
     */
    void wordWithUppercase(String line) {
        String[] chars = line.split("");
        String str1 = "";
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = chars[i].toUpperCase();
            }
            str1 += chars[i];
        }
        System.out.println(str1);
    }

    /**
     * Given two strings, write a method that returns one string made of two strings.
     * First letter of new string is first letter of first string,
     * second letter of new string is first letter of second string and so on.
     *
     * @param str1, str2
     */
    void twoStringsInOne(String str1, String str2) {
        String str = "";
        for (int i = 0; i < str1.length() || i < str2.length(); i++) {
            if (i < str1.length()) {
                str += str1.charAt(i);

            }
            if (i < str2.length()) {
                str += str2.charAt(i);
            }
        }
        System.out.print(str);
    }

    /**
     * Given a string, write a method that counts its number of words.
     * Assume there are no leading and trailing whitespaces and there is only single
     * whitespace between two consecutive words.
     *
     * @param line
     */
    void numberOfWords(String line) {
        String[] str = line.split(" ");
        System.out.println(str.length);
    }

    /**
     * Given a string, write a method that returns new string with reverted words order.
     * Pay attention to the punctuation at the end of the sentence (period).
     * @param line
     */
    void revertedWOrds(String line){
        String[] str = line.split(" ");
        boolean digit = true;
        for (int i = 0; i < str.length; i++) {

        }
    }


    public static void main(String[] args) {
        Strings str = new Strings();
//        str.sumOfAllDigitsString();
//        str.wordWithUppercase("Aliquam dolor nisl?");
//        str.twoStringsInOne("good one", "111");
//        str.numberOfWords("This is sample sentence");
        str.revertedWOrds("John Doe.");
    }
}
