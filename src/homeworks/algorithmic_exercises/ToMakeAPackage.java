package homeworks.algorithmic_exercises;

public class ToMakeAPackage {
    public static void main(String[] args) {
        toMakeAPackage(5, 2, 24);
    }

    public static boolean toMakeAPackage(int a, int b, int c) {
        boolean possible = true;
        if (c % (a + b) == 0) {
            System.out.println(possible);
        } else {
            System.out.println(!possible);
        }
        return possible;
    }
}
