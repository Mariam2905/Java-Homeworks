package org.example.practics.enum2.traffic_lights;

public enum Light {
    RED(3000), YELLOW(4000), GREEN(5000);

    private int second;

    Light(int second) {
        this.second = second;
    }

    Light() {

    }

    public int getSecond() {
        return second;
    }
}
