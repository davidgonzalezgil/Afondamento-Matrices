package biblioteca;

import static biblioteca.Basicas.*;
import java.util.Scanner;

public class test8 {

    //pedir una matriz 3x3 y calcular su determinante

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        System.out.println("introduce datos:");
        int[][] matriz = fillFromkeyboard(rows, cols, sc);
        System.out.println("matriz:");
        print2DArray(matriz);
        int res = determinant(matriz);
        System.out.println("resultado:");
        System.out.println(res);

    }

}