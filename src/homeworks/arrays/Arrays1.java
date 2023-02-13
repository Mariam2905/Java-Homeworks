package homeworks.arrays;

import java.util.Arrays;

public class Arrays1 {
    /**
     * 1․ Գրել method, որը տպում է int[] n  array-ի դրական տարրերը․
     */
    public static void positiveNumberOfArray() {
        int[] array = {25, 147, -87, 0, 471, -123, 0, -25, 75};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * 2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
     * Օրինակ՝ ( 257 -> 752)․
     */
    public static void opposite() {
        short[] array = {2, 5, 7};
        System.out.print("First array is: ");
        for (short i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (short j = 0; j < array.length / 2; j++) {
            short element = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = element;
        }
        System.out.println();
        System.out.print("The riversed array is: ");
        for (short k = 0; k < array.length; k++) {
            System.out.print(array[k]);
        }
    }

    /**
     * 3. Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը․
     */
    public static void maxElement() {
        long[] array = {4, 7, 1, 5, 2};
        long maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println(maxElement);
    }

    /**
     * 4. Գրել method, որը գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը․
     */
    public static void minElement() {
        float[] array = {4.2f, -127.3f, 0.0f, 4.3f};
        float minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println(minElement);
    }

    /**
     * 5. Գրել method, որը int[] n array-ի էլեմենտները և տեղափոխում int[] m array-ի մեջ։
     */
    public static void transfer() {
        int[] array1 = {14, 58, 69, 2, -14, 0, 4};
        int[] array2 = new int[7];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + " ");
        }
    }

    /**
     * 6․ Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ,
     * գումարում է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։
     * Oրինակ՝ array1 = {1,5,6,4,7}
     * array2 = {7,4,2,3,5}
     * array3 = {8,9,8,7,12}
     */
    public static void sumOfElementsArray() {
        int[] array1 = {1, 5, 6, 4, 7};
        int[] array2 = {7, 4, 2, 3, 5};
        int[] array3 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.print(array3[i] + " ");
        }
    }

    /**
     * 7. Գրել method, որը հաշվում է թե քանի անգամ է k թիվը հանդիպել array-ի Էլեմենտների մեջ։
     * Oրինակ՝  array = {1,5,6,4,5}
     * k = 5; // 2
     */
    public static void repeatNumber(int repeatNumber) {
        int[] array = {3, 5, 6, 4, 5, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == repeatNumber) {
                count++;
            }
        }
        System.out.print(count);
    }

    /**
     * 8․Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։
     * Եռյակներում թվերի դասավորությունը էական չէ․
     * Oրինակ՝  array = {1,5,6,4}
     * // {1,5,6},  {1,5,4} ,{1,4,6}, {4,5,6}
     */
    public static void trio() {
        int[] array = {1, 5, 6, 4};
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = j; k < array.length; k++) {
                    if (array[i] != array[j] && array[j] != array[k]) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        System.out.println(array[i] + " " + array[k] + " " + array[j]);
                        System.out.println(array[j] + " " + array[i] + " " + array[k]);
                        System.out.println(array[j] + " " + array[k] + " " + array[i]);
                        System.out.println(array[k] + " " + array[i] + " " + array[j]);
                        System.out.println(array[k] + " " + array[j] + " " + array[i]);
                    }
                }
            }
        }
    }

    /**
     * 9․ Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
     *
     * @param array;
     */
    public static void descendingSequence(int[] array) {
        System.out.print("Our array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("In descending order, our array is: ");
        for (int k = 0; k <= array.length; k++) {
            for (int j = k + 1; j < array.length; j++) {
                if (array[k] < array[j]) {
                    int flag = array[k];
                    array[k] = array[j];
                    array[j] = flag;
                }
            }
        }
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + " ");
        }
    }

    /**
     * 10․ Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:
     * Oրինակ՝  array = {1,5,6,4,9,7,1}
     * // {6,4,1,5,9,7,1}
     *
     * @param array;
     */
    public static void oddAtTheEnd(int[] array) {
        System.out.print("Our array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("The sorted array is: ");
        for (int k = 0; k <= array.length; k++) {
            for (int j = k + 1; j < array.length; j++) {
                if (array[k] % 2 != 0) {
                    int flag = array[k];
                    array[k] = array[j];
                    array[j] = flag;
                }
            }
        }
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + " ");
        }
    }

    /**
     * 11․ Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
     * Oրինակ՝  array = {1,0,6,4,9,0,0}
     * // {1,6,4,9}
     */
    public static void withoutZeros() {
        int[] array = {1, 0, 6, 4, 9, 0, 0};
        System.out.print("Our array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Our array without zeros is: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            }
            System.out.print(array[i] + " ");
        }
    }

    /**
     * 12․ Տպել տրված թվերի հաջորդականության ամենաերկար աճող ենթահաջորդականությունը:
     * Oրինակ՝  array = {1,5,6,4,9,0,4,7,7,9, 1}
     * // {0,4,7,7,9}
     */
    public static void longestIncreasingSubsequence() {
        int[] array = {1, 5, 6, 4, 9, 0, 4, 7, 7, 9, 1};
        for(int k = 0; k< array.length; k++){
            array[k] = 1;
            for(int i = 0; i<k; i++){
                if(array[i]<array[k]){
                    array[k] = Math.max(array[k], array[i]+1);
                }
            }
        }
    }

    /**
     * 13․ Ներածել n բնական թիվը 2-ական տեսքով՝ տանալով 0-ներից ու 1-երից կազմված զանգված
     * և արտածել n  թվի 10-ական ներկայացումը:
     * Oրինակ՝    array = {1,1,0,0,1,1}
     * // 51
     */
    public static void withBinaryForm() {
        int[] array = {1, 1, 0, 0, 1, 1};
        int number = 0;
        int degree = 0;
        for (int i = array.length-1; i >=0; i--) {
            number += array[i]*Math.pow(2,degree);
            degree++;
        }
        System.out.println(number);
    }

    /**
     * 14․ Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:
     */
    public static void aboveTheDiagonal() {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    /**
     * 15․ Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:
     */
    public static void respectToTheInvertedDiagonal() {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flag = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = flag;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " ");
            }
        }
    }

    /**
     * 16․ Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES,
     * եթե նրա բոլոր տողերի տարրերի գումարը զրո է։  NO հակառակ դեպքում։
     * Oրինակ՝    a = {1,-1,0,0}
     * {2,-2,1,-1}        // YES
     * {9,7,1,-17}
     * <p>
     * a = {1,1,0,0}
     * {2,-2,1,-1}        //NO
     * {9,7,1,-17}
     */
    public static void sumIsZero() {
        int[][] array = {{1, -1, 0, 0}, {2, -2, 1, -1}, {9, 7, 1, -17}, {4, 5, 7, -11}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        if (sum == 0) {
            System.out.println("The sum of all its row elements is: " + sum);
            System.out.println("Yes");
        } else {
            System.out.println("The sum of all its row elements is: " + sum);
            System.out.println("No");
        }
    }


    public static void main(String[] args) {
//        positiveNumberOfArray();
//        opposite();
//        maxElement();
//        minElement();
//        transfer();
//        sumOfElementsArray();
//        repeatNumber(3);
//        trio();
        int[] array = {17, 25, 0, 124, -36, -19, 48};
//        descendingSequence(array);
//        oddAtTheEnd(array);
//        withoutZeros();
        longestIncreasingSubsequence();
//        withBinaryForm();
//        aboveTheDiagonal();
//        respectToTheInvertedDiagonal();
//        sumIsZero();
    }
}
