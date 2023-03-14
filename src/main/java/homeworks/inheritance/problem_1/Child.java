package homeworks.inheritance.problem_1;

public class Child extends Parent {
    @Override
    void showMessage() {
        super.showMessage();
        System.out.println("Hello Child class.");
    }
}
