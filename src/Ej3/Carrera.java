package Ej3;

public class Carrera {
    private boolean inicio = false;

    public synchronized void esperarInicio() throws InterruptedException {
        while (!inicio) {
            wait();
        }
    }

    public synchronized void iniciarCarrera() throws InterruptedException {
        System.out.println("Preparados...");
        Thread.sleep(1000);
        System.out.println("Listos...");
        Thread.sleep(1000);
        System.out.println("¡Ya!");
        inicio = true;
        notifyAll();
    }

    public void terminarCarrera(int dorsal, long tiempo) {
        System.out.println("El caracol del dorsal " + dorsal + " ha acabado la carrera en " + tiempo/1000 + " segundos.");
    }
}