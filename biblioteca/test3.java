package biblioteca;

import static biblioteca.Basicas.esSimetrica;
import static biblioteca.Basicas.fillFromkeyboard;
import static biblioteca.Basicas.print2DArray;
import static biblioteca.Basicas.trace;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dame numero filas");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("dame numero columnas");
        int cols = Integer.parseInt(sc.nextLine());

        int[][] matriz = fillFromkeyboard(rows, cols, sc);

        System.out.println("Matriz ingresada:");
        print2DArray(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz NO es simetrica");
        }

        try {
            int traza = trace(matriz);
            System.out.println("La traza es: " + traza);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}