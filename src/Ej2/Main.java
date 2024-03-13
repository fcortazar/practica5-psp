package Ej2;

public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        Caracol caracol1 = new Caracol("Caracol 1", carrera);
        Caracol caracol2 = new Caracol("Caracol 2", carrera);
        Caracol caracol3 = new Caracol("Caracol 3", carrera);
        Caracol caracol4 = new Caracol("Caracol 4", carrera);

        caracol1.start();
        caracol2.start();
        caracol3.start();
        caracol4.start();
    }
}