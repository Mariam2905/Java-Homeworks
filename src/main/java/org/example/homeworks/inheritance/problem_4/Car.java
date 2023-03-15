package org.example.homeworks.inheritance.problem_4;

public class Car {
    private int passengerCount;
    private char engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 2) {
            this.passengerCount = passengerCount;
        }
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        if (Character.isAlphabetic(engineType)) {
            this.engineType = engineType;
        }
    }
}
