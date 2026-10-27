package biblioteca;

import java.util.Scanner;

public class Basicas {

    // Función que pide matriz de enteros al usuario y la devuelve
    public static int[][] fillFromkeyboard(int rows, int cols, Scanner sc) {
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        return array;
    }

    // Función que imprime matriz de enteros
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Función que devuelve la transpuesta de una matriz
    public static int[][] transpuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }

    // Función que devuelve la traza de una matriz cuadrada de enteros
    public static int trace(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la traza");
        }
        int trace = 0;
        for (int i = 0; i < rows; i++) {
            trace += array[i][i];
        }
        return trace;
    }

    // Función que devuelve un booleano indicando si la matriz es simétrica o no
    public static boolean esSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = i + 1; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    /*
     * ALGORITMO EsMatrizDiagonal
     * ENTRADA: matriz[N][M] (array bidimensional de números)
     * SALIDA: booleano (VERDADERO si es diagonal, FALSO si no)
     */
    public static boolean esMatrizDiagonal(int[][] matriz) {
        int filas = matriz.length;
        if (filas == 0) return false;
        int columnas = matriz[0].length;

        // 1. Comprobar que es una matriz cuadrada
        if (filas != columnas) {
            return false;
        }

        // 2. Recorrer la matriz para verificar los elementos fuera de la diagonal
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    // Método que calcula la matriz suma de dos matrices de enteros
    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;

        if (filas1 != filas2 || columnas1 != columnas2) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones para sumarlas.");
        }

        int[][] resultado = new int[filas1][columnas1];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    // Método que resta dos matrices de enteros
    public static int[][] restaMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;

        if (filas1 != filas2 || columnas1 != columnas2) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones para restarlas.");
        }

        int[][] resultado = new int[filas1][columnas1];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        return resultado;
    }

    // Método que multiplica dos matrices de enteros
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;

        // Validación de dimensiones: columnas de la 1ª deben ser iguales a filas de la 2ª
        if (columnas1 != filas2) {
            throw new IllegalArgumentException("El número de columnas de la primera matriz debe coincidir con el número de filas de la segunda.");
        }

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }
}