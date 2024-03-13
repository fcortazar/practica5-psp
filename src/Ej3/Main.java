package Ej3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Carrera carrera = new Carrera();
        CaracolMotorizado[] caracoles = new CaracolMotorizado[8];

        for (int i = 0; i < caracoles.length; i++) {
            caracoles[i] = new CaracolMotorizado(i+1, carrera);
            caracoles[i].start();
        }

        carrera.iniciarCarrera();
    }
}