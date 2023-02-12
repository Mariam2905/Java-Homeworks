package homeworks.arrays;

public class Arrays {
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

    public static void main(String[] args) {
//        positiveNumberOfArray();
//        opposite();
//        maxElement();
//        minElement();
//        transfer();
//        sumOfElementsArray();
        repeatNumber(3);
    }
}
