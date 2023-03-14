package homeworks.inheritance.problem_2;

public class SubClass extends SuperClass {
    private String message = "Hello SubClass class.";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(super.getMessage());
        System.out.println(message);
    }
}
