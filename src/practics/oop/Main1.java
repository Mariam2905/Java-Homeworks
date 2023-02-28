package practics.oop;

import practics.oop.problem1.ChildOne;
import practics.oop.problem1.Parent;

public class Main1 {
    public static void main(String[] args) {
        Parent child = new ChildOne();
        child.message();
        Parent parent = new Parent();
        parent.message();
    }
}
