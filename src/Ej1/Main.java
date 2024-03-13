package Ej1;

class PimThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("PIM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PamThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("PAM");
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
        PimThread pimThread = new PimThread();
        PamThread pamThread = new PamThread();

        pimThread.start();
        pamThread.start();
    }
}
