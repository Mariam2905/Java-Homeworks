package org.example.homeworks.string_stringbuilder;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil_2 {

    /**
     * 1. Given a string, return a string made of the first 2 chars (if present), however include
     * first char only if it is 'o' and include the second only if it is 'z',
     * so "ozymandias" yields "oz".
     *
     * @param str;
     */
    void first2Chars(String str) {
        if (str.startsWith("oz")) {
            System.out.println(str.substring(0, 2));
        } else if (str.startsWith("o")) {
            System.out.println(str.charAt(0));
        } else if (str.charAt(1) == 'z') {
            System.out.println("z");
        } else {
            System.out.println("");
        }
    }


    /**
     * 2. Count the number of "xx" in the given string.
     * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     *
     * @param str; return count;
     */
    int numberOfChar(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    /**
     * 3. A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
     * Write a method that detects if a string is a palindrome.
     *
     * @param str, return boolean
     */
    boolean isPalindrome(String str) {
        boolean isPalindrome = false;
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        if (str.equals(str1)) {
            return !isPalindrome;
        } else {
            return isPalindrome;
        }
    }
    // 2-րդ եղանակ
//    boolean isPalindrome(String str) {
//        boolean isPalindrome = false;
//        StringBuilder word = new StringBuilder(str);
//        word.reverse();
//        String revStr = word.toString();
//        if (str.equals(revStr)) {
//            return !isPalindrome;
//        } else {
//            return isPalindrome;
//        }
//    }

    /**
     * 4. Given a list of strings, write a method that returns a list of all strings
     * that start with the letter 'a' (lower case) and have exactly 3 letters.
     */
    void listOfStrings() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String str = "";
        String list = "";
        while (i < 4) {
            System.out.println("Enter the word: ");
            str = sc.nextLine();
            i++;
            if (str.charAt(0) == 'a' && str.length() == 3) {
                list = str;
            }
        }
        System.out.print(list + " ");
    }

    /**
     * 5. Write a method that returns a comma-separated string based on a given list of integers.
     * Each element should be preceded by the letter 'e' if the number is even,
     * and preceded by the letter 'o' if the number is odd.
     * For example, if the input list is (3,44), the output should be 'o3,e44'.
     */
//    void commaSeparatedString(float number) {
//        String[] strValues = String.valueOf(number).split("\\.");
//        double val1 = Double.parseDouble(strValues[0]);
//        double val2 = Double.parseDouble(strValues[1]);
//        if (val1 % 2 == 0) {
//
//        }
//    }
    void commaSeparatedString(String str) {
        String subStr = Arrays.toString(str.split(","));
        for (int i = 0; i < str.length(); i++) {

            //լրացնել

        }
    }

    /**
     * 6. Шифр Цезаря — это базовая техника шифрования, которую Юлий Цезарь
     * использовал для безопасного общения со своими генералами.
     * Каждая буква заменяется другой буквой на N позиций вниз в английском алфавите.
     * Например, для поворота на 5 буква «с» будет заменена на «h».
     * В случае «z» алфавит вращается, и он превращается в «d».
     * Реализуйте декодер для шифра Цезаря, где N = 5.
     * @param text, number
     * @return newText;
     */
    String chipherCaesar(String text, int number) {
        String newText = "";
        char flag = text.charAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 65 && text.charAt(i) <= 90 - number || text.charAt(i) >= 97 && text.charAt(i) <= 122 - number) {
                flag = (char) (text.charAt(i) + number);
            } else if (text.charAt(i) > 90 - number && text.charAt(i) <= 90 || text.charAt(i) > 122 - number && text.charAt(i) <= 122) {
                flag = (char) (text.charAt(i) + number - 26);
            }
            newText += flag;
        }
        return newText;
    }
//ամենաէֆեկտիվ տարբերակը (str-65+5)%26+65

    /**
     * 7. A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
     * Write a method that returns the longest palindrome substring of a given string.
     *
     * @param word; return longest;
     */
    int theLongestPalindrome(String word) {
        int maxlength = 0;
        int index = 0;
        String subPalindrome = "";
        boolean isPalindrome = false;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                isPalindrome = true;
                for (int k = i; k <= j; k++) {
                    if (word.charAt(k) != word.charAt(j - (k - i))) {
                        isPalindrome = false;
                    }
                }
                if (isPalindrome && j - i + 1 > maxlength) {
                    index = i;
                    maxlength = j - i + 1;
                }
            }
        }
        for (int l = index; l < index + maxlength; l++) {
            subPalindrome += word.charAt(l);
        }
        return maxlength;
    }

    /**
     * 8.	Given two strings, write a method that finds the longest common sub-sequence.
     * @param str1, str2,
     * @return result;
     */
    String longestCommonSubSequence(String str1, String str2) {
        String result = "";
        for (int i = str1.length(); i > 0; i--) {
            int startIndex = 0;
            while (startIndex + i <= str1.length()) {
                String current = str1.substring(startIndex, startIndex + i);
                if (str2.contains(current)) {
                    result = current;
                    break;
                }
                startIndex++;
            }
            if (result.length() != 0) {
                break;
            }
        }
        return result;
    }

    /**
     * 9. Given two strings, find the number of common characters between them.
     *
     * @param string1, string2;
     *                 return count;
     */
    int commonCharacters(String string1, String string2) {
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
//                int count = 0;
//                char[] char1 = string1.toCharArray();
//                char[] char2 = string2.toCharArray();
//                if (char1.length >= char2.length) {
//                    for (int i = 0; i < char2.length; i++) {
//                        if (char1[i] == char2[i]) {
//                            count++;
//                        }
//                    }
//                } else {
//                    for (int j = 0; j < char1.length; j++) {
//                        if (char2[j] == char1[j]) {
//                            count++;
//                        }
//                    }
//                }
//        System.out.println(count);
//        return count;
//    }

    /**
     * 10. Write a function that reverses characters in (possibly nested) parentheses
     * in the input string. Input strings will always be well-formed with matching ()s.
     * <p>
     * Example
     * For inputString = "(bar)", the output should be solution (inputString) = "rab";
     * For inputString = "foo(bar)baz", the output should be solution(inputString) = "foorabbaz";
     * For inputString = "foo(bar)baz(blim)", the output should be solution(inputString) = "foorabbazmilb";
     * For inputString = "foo(bar(baz))blim", the output should be solution(inputString) = "foobazrabblim".
     * Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
     *
     * @param str;
     * @return str;
     */
    String reverserCharacters(String str) {
        int index1 = -1;
        int index2 = -1;
        while (str.contains("(")) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(')
                    index1 = i;
                if (ch == ')') {
                    index2 = i;
                    String str1 = str.substring(0, index1);
                    String str2 = str.substring(index2 + 1);
                    StringBuilder sb = new StringBuilder(str.substring(index1 + 1, index2));
                    str = str1 + sb.reverse().toString() + str2;
                    break;
                }
            }
        }
        return str;
    }


    public static void main(String[] args) {
        StringUtil_2 myHomework = new StringUtil_2();
//        myHomework.first2Chars("ozymandias");
//        myHomework.numberOfChar("xxx");
//        System.out.println(myHomework.isPalindrome("abcba"));
//        myHomework.listOfStrings();
//        myHomework.commaSeparatedString(3.44f);
//        myHomework.commaSeparatedString("3.44");
        System.out.println(myHomework.chipherCaesar("Java", 5));
//        System.out.println(myHomework.theLongestPalindrome("nowabbas"));
//        System.out.println(myHomework.longestCommonSubSequence("JDK Java", "JVM Java"));
//        myHomework.commonCharacters("JAVA", "JVM");
//        System.out.println(myHomework.reverserCharacters("foo(bar(baz))blim"));
    }
}
