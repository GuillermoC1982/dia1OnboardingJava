import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numero = 10;
        float flotante = 10.5f;
        double decimal = 20.5;
        char caracter = 'A';
        boolean esVerdadero = true;

        System.out.println("Número: " + numero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Decimal: " + decimal);
        System.out.println("Caracter: " + caracter);
        System.out.println("Es Verdadero: " + esVerdadero);


        int a = 10;
        int b = 20;

        // Operadores aritméticos
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = b / a;
        int modulo = b % a;

        // Operadores de comparación
        boolean esIgual = a == b;
        boolean esDiferente = a != b;
        boolean esMayor = a > b;
        boolean esMenor = a < b;
        boolean esMayorOIgual = a >= b;
        boolean esMenorOIgual = a <= b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        System.out.println("Es Igual: " + esIgual);
        System.out.println("Es Diferente: " + esDiferente);
        System.out.println("Es Mayor: " + esMayor);
        System.out.println("Es Menor: " + esMenor);
        System.out.println("Es Mayor o Igual: " + esMayorOIgual);
        System.out.println("Es Menor o Igual: " + esMenorOIgual);

        // Bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("Bucle for, iteración: " + i);
        }

        // Bucle while
        int j = 0;
        while (j < 5) {
            System.out.println("Bucle while, iteración: " + j);
            j++;
        }

        // Bucle do-while
        int k = 0;
        do {
            System.out.println("Bucle do-while, iteración: " + k);
            k++;
        } while (k < 5);

        // Bucle foreach
        int[] array = {1, 2, 3, 4, 5};
        for (int elemento : array) {
            System.out.println("Bucle foreach, elemento: " + elemento);
        }


        Main main = new Main();
        main.saludar();

        int resultado = Main.sumar(5, 3);
        System.out.println("Resultado de la suma: " + resultado);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + "!");

    }


    public void saludar() {
        System.out.println("¡Hola desde un método no estático!");
    }


    public static int sumar(int a, int b) {
        return a + b;
    }
}