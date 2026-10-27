package biblioteca;

import static biblioteca.Basicas.*;
import java.util.Scanner;

public class test7 {

    // PEDIR tres arrays A B y C y multiplicarlos
    // cols de a coincide con rows de b
    // cols de b coincide con rows de c
    // resultado da rows de por cols de c

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("dame numero filas");
        int rows1 = Integer.parseInt(sc.nextLine());
        System.out.println("dame numero columnas");
        int cols1 = Integer.parseInt(sc.nextLine());
        int[][] matriz1 = fillFromkeyboard(rows1, cols1, sc);

        System.out.println("dame numero filas");
        int rows2 = Integer.parseInt(sc.nextLine());
        System.out.println("dame numero columnas");
        int cols2 = Integer.parseInt(sc.nextLine());
        int[][] matriz2 = fillFromkeyboard(rows2, cols2, sc);

        System.out.println("dame numero filas");
        int rows3 = Integer.parseInt(sc.nextLine());
        System.out.println("dame numero columnas");
        int cols3 = Integer.parseInt(sc.nextLine());
        int[][] matriz3 = fillFromkeyboard(rows3, cols3, sc);

        System.out.println("matriz 1:");
        print2DArray(matriz1);

        System.out.println("matriz 2:");
        print2DArray(matriz2);

        System.out.println("matriz 3:");
        print2DArray(matriz3);

        int[][] temp12 = multiplicarMatrices(matriz1, matriz2);
        int[][] resultadoFinal = multiplicarMatrices(temp12, matriz3);

        System.out.println("resultado:");
        print2DArray(resultadoFinal);

    }

}
