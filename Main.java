public class Main {

    public static void sumaDe3(String[] args) { // Funcion de suma de 3 variables
        sumaDe3(5, 4, 1);
    }

    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }
}
    public static int sumaDe3(int a, int b, int c) {
        int sumaDe3;
        sumaDe3 = a + b + c;
        System.out.println(sumaDe3);
        return sumaDe3;
    }
}

class Coche {
    public int puertas = 3;

    public void agregarPuerta() {
        this.puertas++;
    }
