package org.example.practics.enum2.traffic_lights;

import java.util.Timer;
import java.util.TimerTask;

public class TrafficLight extends ChangeState {
    static Timer timer = new Timer();
    private Light light;
    Light lights = Light.RED;
//    TrafficLight lights1 = new TrafficLight()

    public TrafficLight(Light light) {
        this.light = light;
    }

    @Override
    public void ChangeState() {

    }

    private static class Change extends TimerTask{
        @Override
        public void run() {
//           switch (){
//
//           }
            }

    }
//    @Override
//    public void ChangeState() {
//
//        }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
