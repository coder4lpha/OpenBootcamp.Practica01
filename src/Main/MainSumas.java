package Main;

public class MainSumas {

    public static void main(String[] args) {

        suma(10, 20, 30);

        Coche miCoche = new Coche();
        miCoche.aumentaPuertas();

    }

    public static void suma(int numUno, int numDos, int numTres) {
        int resultado;
        resultado = numUno + numDos + numTres;

        System.out.println("Primera parte\n" + "=============\n" + "Los números son: "
                + numUno + ", " + numDos + " y " + numTres
                + "\ny el resultado es: " + resultado);
    }
}

class Coche {

    public int puertas = 4;

    public void aumentaPuertas() {
        this.puertas++;
        System.out.println("\nSegunda parte\n" + "=============\n"
                + "Número de puertas del coche: " + puertas);
    }

}