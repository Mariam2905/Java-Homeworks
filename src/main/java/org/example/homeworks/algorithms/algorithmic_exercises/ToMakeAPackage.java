package org.example.homeworks.algorithms.algorithmic_exercises;

public class ToMakeAPackage {

    /**
     * This method returns true if it is possible to make a package with goal kilos of rice.
     *
     * @param bigBag
     * @param smallBag
     * @param goal
     * @return possible;
     */
    boolean toMakeAPackage(int bigBag, int smallBag, int goal) {
        boolean possible = true;
        int bigBagRice = bigBag * 5;
        int smallBagRice = smallBag * 1;
        try {
            if (smallBag < 0 || bigBag < 0 || goal < 0) {
                throw new IndexOutOfBoundsException("The weight must not be a negative number.");
            }
            if (bigBagRice + smallBagRice == goal || (bigBagRice + smallBagRice > goal && bigBagRice < goal)) {
                System.out.println("You can make a package.");
                return possible;
            } else {
                System.out.println("You can't make a package.");
                return !possible;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return possible;
    }

    public static void main(String[] args) {
        ToMakeAPackage obj = new ToMakeAPackage();
        obj.toMakeAPackage(3, 5, 11);
    }
}
