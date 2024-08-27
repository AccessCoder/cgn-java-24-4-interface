package de.neuefische;

public class Plane implements Noisy, CanFly {
    @Override
    public void makeNoise() {
        System.out.println("Loud Plane Sounds");
    }

    @Override
    public void takeOff() {
        System.out.println("The Plane takes off");
    }
}
