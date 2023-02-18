package homeworks.string_stringbuilder;

public class StringAndStringBuilderHomework {
    /**
     * 1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
     * Նույնը  խնդիրը  StringBuilder-ով.
     * 1.1     “hello” , “world”
     * 1.2     1 , 2 , “hello”
     * 1.3     “1” , 2 , “hello”
     * 1.4     “hello”, 1 ,2, “world”
     */
    void concatenation() {
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1.concat(str2));
        int num1 = 1;
        int num2 = 2;
        System.out.println(Integer.toString(num1).concat(Integer.toString(num2)).concat("hello"));
        String str3 = "1";
        String str4 = str3.concat(Integer.toString(num2));
        String str5 = str4.concat("hello");
        System.out.println(str5);
        System.out.println(str1.concat(Integer.toString(num1)).concat(Integer.toString(num2)).concat(str2));
    }

    void methodconcatenationWithStringBuilder() {
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);
        StringBuilder str1 = new StringBuilder("1");
        str1.append(2);
        StringBuilder str2 = str1.append("hello");
        System.out.println(str2);
        StringBuilder str3 = new StringBuilder("hello");
        StringBuilder str4 = str3.append("1").append("2").append("world");
        System.out.println(str4);
    }

    /**
     * 2. Գրել method, որը ստանում է String պարամետր և տպում է ամեն դատարկ սիմվոլից նոր տողում օգտագործելով String Literal ( \t, \b ….)․
     * actual:  “We are living in”
     * result:  We
     * are
     * living
     * in
     *
     * @param str; return str;
     */
    String splitText(String str) {
        String[] array = str.split("[\t '',\b '',\n '',\r,'']");
        for (String i : array) {
            System.out.println(i);
        }
        return str;
    }

    /**
     * 3. Գրել method (reverse), որը  շուռ է տալիս String.
     * actual:   “sample”
     * result:  “elpmas”
     *
     * @param str; return result;
     */
//    StringBuilder reverseWord(String str) {
//        StringBuilder result = new StringBuilder(str);
//        result.reverse();
//        System.out.println(result);
//        return result;
    String reverseWord(String str) {
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
        }
        System.out.println(result);
        return result;
    }

    /**
     * 4.Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.
     * <p>
     * int countSubString(String line, String token)
     * token = “in”  ,    line =  “We are living in an yellow submarine. We don't  have anything”
     * 4 անգամ
     *
     * @param str, token; return count;
     */
    int tokenInWord(String str, String token) {
        int count = 0;
        System.out.println(str.contains(token));
        String[] arr = str.split(token);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i])) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    /**
     * 5․  Գրել method, որը  տեքստը սարքում է մեծատառերով գրված, օգտագործելով String.
     * Նույնը  խնդիրը   StringBuilder-ով.
     * <p>
     * actual:   “hello world”
     * result:  “HELLO WOLRD”
     *
     * @param str; return result;
     */
    String toUpperCaseText(String str) {
        String result = str.toUpperCase();
        System.out.println(result);
        return result;
    }

    void toUpperCaseText1() {
        StringBuilder str = new StringBuilder("hello world");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(str);
    }

    /**
     * 6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող,տպում այն,
     * եթե տողի երկարությունը պակաս է 20-ից,
     * ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
     * actual:   “Armenia”
     * result:  “Armenia*************”
     */
    void lineText() {
        StringBuilder str = new StringBuilder("Armenia");
        StringBuilder str1 = new StringBuilder(20);
        while (str.length() < str1.capacity()) {
            str.append('*');
        }
        System.out.println(str);
    }

    /**
     * 7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները.
     * Նույնը խնդիրը  StringBuilder-ով.
     * actual:  “We are living in an yellow submarine. We don't  have anything”
     * result:  “We re living in n yellow submrine. We don't  hve nything”
     *
     * @param line;
     */
    void textWithoutCharA(String line) {
        String newLine = splitText("");
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != 'a') {
                newLine += line.charAt(i);
            }
        }
        System.out.println(newLine);
    }


    void textWithoutCharA1() {
        StringBuilder str = new StringBuilder("We are living in an yellow submarine. We don't have anything");
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
    }

    /**
     * 8. Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.
     * actual:  “We are living in an yellow submarine. We don't  have anything”
     * result:  “We *re living in *n yellow subm*rine. We don't  h*ve *nything”
     *
     * @param text
     */
    String replaceChar(String text) {
        String newText = text.replace('a', '*');
        System.out.println(newText);
        return newText;
    }

    /**
     * 9. Գրել method, որը գտնում է տեքստում ամենաերկար բառը,
     * տեքստում բառերը անջատված են իրարից պռոբելով.
     * actual:  “We are living in an yellow submarine. We don't  have anything”
     * result:  submarine
     *
     * @param line; return longWord;
     */
    String longWord(String line) {
        String[] words = line.split(" ");
        String longWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longWord.length()) {
                longWord = words[i];
            }
        }
        System.out.println(longWord);
        return null;
    }

    /**
     * 10․ Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c սիմվոլը.
     * actual:  String c = “a” ,  “We are living in an yellow submarine. We don't have anything”
     * result:  index 3
     *
     * @param text, symbol
     */
    void firstCharIndex(String text, String symbol) {
        System.out.println(text.indexOf(symbol));
    }

    /**
     * 11․ Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը,
     * օգտագործելով String.
     * Նույնը խնդիրը  StringBuilder-ով.
     * void printSubLine(String line, int n)
     * void printSubLine(StringBuilder line, int n)
     *
     * @param line, n
     */
    void printSubLine(String line, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(line.charAt(i));
        }
    }

    void printSubLine1(String line, int n) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            text.append(line.charAt(i));
        }
        System.out.println(text);
    }

    /**
     * 12. Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը դատարկ և null չէ․
     *
     * @param str; return boolean;
     */
    boolean ifIsEmpty(String str) {
        boolean isEmpty = false;
        System.out.println(str.isEmpty());
        return isEmpty;
    }

    /**
     * 13. Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’ և գտում ամեներկար բառը ․
     * actual:  “We, are, living, in an, yellow, submarine, We don't, have anything”
     * result:    have anything
     *
     * @param line; return maxWord;
     */
    String maxWord(String line) {
        String maxWord = "";
        String[] words = line.split(",");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        System.out.println(maxWord);
        return maxWord;
    }


    public static void main(String[] args) {
        StringAndStringBuilderHomework myStr = new StringAndStringBuilderHomework();
        myStr.concatenation();
//        myStr.methodconcatenationWithStringBuilder();
//        myStr.splitText("We are living in");
//        myStr.reverseWord("sample");
//        myStr.tokenInWord("We are living in an yellow submarine. We don't have anything.", "in");
//        myStr.toUpperCaseText("hello world");
//        myStr.toUpperCaseText1();
//        myStr.lineText();
//        myStr.textWithoutCharA("We are living in an yellow submarine. We don't have anything");
//        myStr.textWithoutCharA1();
//        myStr.replaceChar("We are living in an yellow submarine. We don't have anything");
//        myStr.longWord("We are living in an yellow submarine. We don't have anything");
//        myStr.firstCharIndex("We are living in an yellow submarine. We don't have anything", "a");
//        myStr.printSubLine("We are living in an yellow submarine. We don't have anything", 15);
//        myStr.printSubLine1("We are living in an yellow submarine. We don't have anything", 25);
//        myStr.ifIsEmpty("");
//        myStr.maxWord("We, are, living, in an, yellow, submarine, We don't, have anything");
    }
}
