package org.example.homeworks.class_and_object.class_and_object_3;

/*   8.Սահմանել Car class-ը, որը ունի
●	 fields (model, color, currentSpeed (default արժեքը 0), isEngineStart (true or false))
●	 methods (stopEngine() անջատում է մատոռը , startEngine()  միացնում է մատոռը)
Ստեղծել Mercedes  C203 սև   և   S505 սպիտակ  մակնիշի մեքենաներ․
 */

public class Car {
    public String model;
    public String color;
    public int currentSpeed;
    public boolean isEngineStart;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.currentSpeed = 0;
        this.isEngineStart = false;
    }

    boolean stopEngine() {
        isEngineStart = false;
        return stopEngine();
    }

    boolean startEngine() {
        isEngineStart = true;
        return startEngine();
    }

    void carinfo() {
        System.out.print(model + " ");
        System.out.print(color + " ");
        System.out.print(currentSpeed + " ");
        System.out.print(isEngineStart + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Car car1 = new Car("C203", "black");
        Car car2 = new Car("S505", "white");
        car1.carinfo();
        car2.carinfo();
    }
}
