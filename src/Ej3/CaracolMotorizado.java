package Ej3;

public class CaracolMotorizado extends Thread {
    private final Carrera carrera;
    private final int dorsal;

    public CaracolMotorizado(int dorsal, Carrera carrera) {
        this.dorsal = dorsal;
        this.carrera = carrera;
    }

    @Override
    public void run() {
        try {
            carrera.esperarInicio();
            long tiempo = (long) (Math.random() * (10000 - 5000)) + 5000;
            Thread.sleep(tiempo);
            carrera.terminarCarrera(dorsal, tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}