package biblioteca;

import static biblioteca.Basicas.*;
import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de filas y columnas de la primera matriz
        System.out.println("Introduce el numero de filas de la primera matriz: ");
        int rows1 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el numero de columnas de la primera matriz: ");
        int cols1 = Integer.parseInt(sc.nextLine());
        int[][] matriz1 = fillFromkeyboard(rows1, cols1, sc);

        // Pedir el número de filas y columnas de la segunda matriz
        System.out.println("\nIntroduce el numero de filas de la segunda matriz: ");
        int rows2 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el numero de columnas de la segunda matriz: ");
        int cols2 = Integer.parseInt(sc.nextLine());
        int[][] matriz2 = fillFromkeyboard(rows2, cols2, sc);

        // Mostrar la primera matriz
        System.out.println("matriz 1:");
        print2DArray(matriz1);

        // Mostrar la segunda matriz
        System.out.println("matriz 2:");
        print2DArray(matriz2);

        // Calcular la suma, resta y producto de matrices
        int[][] suma = sumaMatrices(matriz1, matriz2);
        int[][] resta = restaMatrices(matriz1, matriz2);

        System.out.println("suma de las matrices: ");
        print2DArray(suma);
        System.out.println("resta de las matrices: ");
        print2DArray(resta);
    }
}