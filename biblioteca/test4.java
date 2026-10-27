package biblioteca;

import static biblioteca.Basicas.esMatrizDiagonal;
import static biblioteca.Basicas.fillFromkeyboard;
import static biblioteca.Basicas.print2DArray;
import static biblioteca.Basicas.trace;
import java.util.Scanner;

public class test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dame numero filas");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("dame numero columnas");
        int cols = Integer.parseInt(sc.nextLine());

        int[][] matriz = fillFromkeyboard(rows, cols, sc);

        System.out.println("Matriz ingresada:");
        print2DArray(matriz);

        if (esMatrizDiagonal(matriz)) {
            System.out.println("Es diagonal");
        } else {
            System.out.println("No es diagonal");
        }

        try {
            int traza = trace(matriz);
            System.out.println("Traza = " + traza);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}