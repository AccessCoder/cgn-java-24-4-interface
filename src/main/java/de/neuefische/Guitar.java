package de.neuefische;

public class Guitar implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Guitar Sounds");
    }
}
