public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
        int resultado = sumaDe3(5, 4, 1);
        System.out.println(resultado);
    }

    public static int sumaDe3(int a, int b, int c) {
        int sumaDe3;
        sumaDe3 = a + b + c;
        return sumaDe3;
    }
}

class Coche {
    public int puertas = 3;

    public void agregarPuerta() {
        this.puertas++;
    }
}

