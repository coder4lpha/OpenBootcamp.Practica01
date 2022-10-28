package Main;

public class Condicionales {

    public static void main(String[] args) {

        NumeroIf(0);
        NumeroWhile();
        NumeroDoWhile();
        NumeroFor();
        EstacionSwitch(3);
    }

    public static void NumeroIf(int numeroIf) {
        System.out.println("\nCondicional IF");
        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número " + numeroIf + " es negativo");
        } else {
            System.out.println("El número es Cero");
        }
    }

    public static void NumeroWhile() {
        System.out.println("\nBucle While");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void NumeroDoWhile() {
        System.out.println("\nBucle Do While");
        int numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
    }

    public static void NumeroFor() {
        System.out.println("\nBucle For");
        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void EstacionSwitch(int estacion) {
        System.out.println("\nCondicional Switch");
        switch (estacion) {
            case 1: case 2: case 3:
                System.out.println("Invierno");
                break;
            case 4: case 5: case 6:
                System.out.println("Primavera");
                break;
            case 7: case 8: case 9:
                System.out.println("Verano");
                break;
            case 10: case 11: case 12:
                System.out.println("Otoño");
            default:
                System.out.println("No hay más de 12 meses en el año");
        }
    }

}
