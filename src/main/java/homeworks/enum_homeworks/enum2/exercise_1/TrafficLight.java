package homeworks.enum_homeworks.enum2.exercise_1;

public class TrafficLight extends ChangeState {
    private States state;

    public TrafficLight(States state) {
        this.state = state;
    }

    @Override
    public void changeState() {
        switch (getState()) {
//            case RED:
//                String red = "Stop!";
//            case YELLOW:
//                String yellow = "Get ready";
//            case GREEN:
//                String green = "Go!!!";

            case RED:
                setState(States.YELLOW);
            case YELLOW:
                setState(States.GREEN);
            case GREEN:
                setState(States.YELLOW);
        }
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }
}
