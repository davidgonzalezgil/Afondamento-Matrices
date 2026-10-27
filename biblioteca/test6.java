package biblioteca;

import static biblioteca.Basicas.fillFromkeyboard;
import static biblioteca.Basicas.multiplicarMatrices;
import static biblioteca.Basicas.print2DArray;

import java.util.Scanner;

public class test6{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //pedir
        System.out.println("dame numero filas");
        int rows1 = Integer.parseInt(sc.nextLine());
        System.out.println("dame numero columnas");
        int cols1 = Integer.parseInt(sc.nextLine());
        int [][] matriz1 = fillFromkeyboard(rows1, cols1, sc);

        System.out.println("dame numero filas");
        int rows2 = Integer.parseInt(sc.nextLine());
        System.out.println("dame numero columnas");
        int cols2 = Integer.parseInt(sc.nextLine());
        int [][] matriz2 = fillFromkeyboard(rows2, cols2, sc);

        System.out.println("matriz 1:");
        print2DArray(matriz1);

        System.out.println("matriz 2:");
        print2DArray(matriz2);

        try {
            int[][] producto = multiplicarMatrices(matriz1, matriz2);
            print2DArray(producto);
        } catch (IllegalArgumentException e) {
            System.out.println("error:"+e.getMessage());
        }

    }
}
