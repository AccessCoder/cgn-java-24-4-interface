package de.neuefische;

public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        Jigsaw jigsaw = new Jigsaw();
        Plane plane = new Plane();

        recordNoise(guitar);
        recordNoise(jigsaw);
        recordNoise(plane);

        Noisy[] noisies = {guitar, jigsaw, plane};

        Noisy noisy = new Plane();

    }

    public static void recordNoise(Noisy noisy){
        System.out.println("Recording started");
        noisy.makeNoise();
        System.out.println("Recording ended");
    }
}