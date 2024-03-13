package Ej11;

class Monitor {
    private boolean isPimTurn = true;

    public synchronized void printPim() {
        while (!isPimTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("PIM");
        isPimTurn = false;
        notify();
    }

    public synchronized void printPam() {
        while (isPimTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("PAM");
        isPimTurn = true;
        notify();
    }
}

class PimThread extends Thread {
    private Monitor monitor;

    public PimThread(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        while (true) {
            monitor.printPim();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PamThread extends Thread {
    private Monitor monitor;

    public PamThread(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        while (true) {
            monitor.printPam();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        PimThread pimThread = new PimThread(monitor);
        PamThread pamThread = new PamThread(monitor);

        pimThread.start();
        pamThread.start();
    }
}

