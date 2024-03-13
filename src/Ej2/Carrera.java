package Ej2;

public class Carrera {
    private int turno = 0;

    public synchronized void esperarTurno() throws InterruptedException {
        int miTurno = turno;
        while (miTurno != turno) {
            wait();
        }
    }

    public synchronized void terminarTurno() {
        turno++;
        notifyAll();
    }
}
