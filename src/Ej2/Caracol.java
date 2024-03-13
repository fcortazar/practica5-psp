package Ej2;

public class Caracol extends Thread {
    private final Carrera carrera;
    private final String nombre;

    public Caracol(String nombre, Carrera carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    @Override
    public void run() {
        try {
            carrera.esperarTurno();
            System.out.println(nombre + " está corriendo...");
            long tiempo = (long) (Math.random() * (30000 - 20000)) + 20000;
            Thread.sleep(tiempo);
            System.out.println(nombre + " ha terminado de correr!");
            carrera.terminarTurno();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
