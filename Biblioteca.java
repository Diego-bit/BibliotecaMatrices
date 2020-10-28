/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author DiegoUP
 */
public class Biblioteca {

    static int M = 1;

    public static int[][] matrizMult() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int R = 0;
        int C = 0;

        String num = "";

        if (M == 1) {
            num = "primera";
            M = 2;
        } else {
            num = "segunda";
        }
        System.out.println("Ingresa el numero de renglones de la " + num + " matriz:");
        entrada = bufer.readLine();
        R = Integer.parseInt(entrada);

        System.out.println("Ingresa el numero de columnas de la " + num + " matriz:");
        entrada = bufer.readLine();
        C = Integer.parseInt(entrada);

        int[][] matriz = new int[R][C];
        return matriz;
    }

    public static int[][] insertarMult(int[][] a) throws IOException {
        int row = a.length;
        int col = a[0].length;
        int[][] matriz = new int[row][col];

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Introduccion de datos");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Escribe el valor para la casilla [" + i + "][" + j + "]:");
                entrada = bufer.readLine();
                matriz[i][j] = Integer.parseInt(entrada);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicacionMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];

                }
            }
        }
        return c;
    }

    public static int[] matrizVec() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int R = 0;
        int C = 0;

        System.out.println("Ingresa el numero de renglones del Vector:");
        entrada = bufer.readLine();
        R = Integer.parseInt(entrada);

        int[] matriz = new int[R];
        return matriz;
    }

    public static int[] insertarVec(int[] a) throws IOException {

        int[] matriz = new int[a.length];

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Introduccion de datos");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Escribe el valor para la casilla [" + i + "]");
            entrada = bufer.readLine();
            matriz[i] = Integer.parseInt(entrada);
        }
        return matriz;
    }

    public static void mostrarVector(int A[]) {
        System.out.println("Este es el resultado: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void matrizCaracol(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] matrizIrregular() {
        Scanner sc = new Scanner(System.in);
        int filas, colum;
        System.out.println("¿Cuantas filas tendra la matriz?");
        filas = sc.nextInt();
        int[][] matriz = new int[filas][];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("¿Cuantas columnas quieres en la posicion [ " + i + " ] ?");
            colum = sc.nextInt();
            matriz[i] = new int[colum];
        }
        System.out.println("Finalizado");
        return matriz;
    }

    public static int[][] matrizTrans() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int R = 0;
        int C = 0;

        System.out.println("Ingresa el numero de renglones de la matriz:");
        entrada = bufer.readLine();
        R = Integer.parseInt(entrada);

        System.out.println("Ingresa el numero de columnas de la matriz:");
        entrada = bufer.readLine();
        C = Integer.parseInt(entrada);

        int[][] matriz = new int[R][C];
        return matriz;
    }

    public static int[][] transponerMatriz(int matriz[][]) {
        int[][] C = new int[matriz[0].length][matriz.length];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                C[y][x] = matriz[x][y];
            }
        }
        return C;
    }

    public static void buscarElemento(int A, int matriz[][]) {
        int pos = 0, fila = 0, colum = 0, cont = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == A) {
                    pos = cont;
                    fila = i;
                    colum = j;
                }
                cont++;//en caso de que no aumentamos el contador y se repite el proceso
            }
        }
        if (pos >= 1) {//imprimimos si se encontro o no el elemento y en que posicion
            System.out.println("Elemento encontrado en la posicion " + (pos) + " de la matriz");
            System.out.println("Se encuentra en la fila " + (fila + 1) + " columna " + (colum + 1));
        } else {
            System.out.println("El elemento no existe en la matriz, lo setimos");
        }
    }

    public static boolean matrizSimetrica(int[][] matriz) {

        return matriz[0].length == matriz.length;

    }

    public static void matrizIdentidad(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                matriz[i][x] = 0;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 1;
        }
        System.out.println("Esta es la Matriz Identidad: ");
        for (int[] A1 : matriz) {
            for (int j = 0; j < A1.length; j++) {
                System.out.print(A1[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void bubbleSort(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j + 1];

                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = temp;

                }
            }
        }

        System.out.println("");
        System.out.println("Matriz Ordenada:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }

    }

    public static void insercion(int a[]) {

        int clave, i, N = a.length;

        for (int j = 1; j < N; j++) {
            clave = a[j];
            i = j - 1;
            while (i > -1 && a[i] > clave) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = clave;
        }

        System.out.println("Matriz Ordenada: ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + ", ");
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        boolean play = false;

        do {
            int op = 0;
            System.out.println("¡Hola!, Ingresa la accion que deseas: (Solo escribe el numero de la opción)");

            System.out.println("1.- Multiplicar dos matrices");
            System.out.println("2.- Mostrar un vector");
            System.out.println("3.- Imprimir matriz caracol");
            System.out.println("4.- Crear una matriz irregular (Solo crea la matriz, no la imprime porque no hay valores dentro de ella)");
            System.out.println("5.- Transponer una matriz");
            System.out.println("6.- Buscar elemento dentro de una matriz");
            System.out.println("7.- Saber si una matriz es simetrica");
            System.out.println("8.- Crear matriz con identidad");
            System.out.println("9.- Ordenar un arreglo por metodo Bubble Sort");
            System.out.println("10.- Ordenar un arreglo por metodo Inserccion");
            System.out.println("11.- Crear Matriz");
            System.out.println("Insertar daton en matriz");
            System.out.println("13.- Salir");
            entrada = bufer.readLine();
            op = Integer.parseInt(entrada);
            boolean salir = false;

            switch (op) {

                case 1:
                    while (!salir) {
                        int[][] matriz1;
                        int[][] matriz2;
                        int[][] a;
                        int[][] b;
                        int[][] c;
                        matriz1 = matrizMult();
                        matriz2 = matrizMult();
                        if (matriz1.length == matriz2[0].length && matriz1[0].length == matriz2.length) {
                            a = insertarMult(matriz1);
                            b = insertarMult(matriz2);
                            c = multiplicacionMatrices(a, b);

                            System.out.println("Resultado de la suma de matrices");
                            System.out.println("===============================");
                            System.out.println("Valores de la Matriz a: ");
                            imprimirMatriz(a);
                            System.out.println("===============================");
                            System.out.println("Valores de la matriz b: ");
                            imprimirMatriz(b);
                            System.out.println("===============================");
                            System.out.println("Resultado:");
                            imprimirMatriz(c);
                        } else {
                            System.out.println("El número de COLUMNAS de la primera matriz debe ser igual al número de RENGLONES de la segunda, y VISEVERSA");
                            System.exit(0);
                        }
                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                M = 1;
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 2:

                    do {
                        int[] A = matrizVec();
                        int[] R = insertarVec(A);
                        mostrarVector(R);

                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    } while (!salir);
                    break;
                case 3:

                    while (!salir) {

                        int a,
                                b;
                        System.out.println("Ingrese la dimension del la matriz");
                        entrada = bufer.readLine();
                        a = Integer.parseInt(entrada);
                        System.out.println("Ingrese el numero de donde quiere que empiece la matriz");
                        entrada = bufer.readLine();
                        b = Integer.parseInt(entrada);
                        matrizCaracol(a, b);
                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }

                    break;
                case 4:
                    while (!salir) {
                        int[][] A = matrizIrregular();
                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 5:
                    while (!salir) {
                        int[][] matriz = matrizTrans();
                        int[][] trans = insertarMult(matriz);
                        System.out.println("Matriz original:");
                        imprimirMatriz(trans);
                        System.out.println("");
                        int[][] fin = transponerMatriz(trans);
                        System.out.println("Matriz transpuesta:");
                        imprimirMatriz(fin);
                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 6:
                    while (!salir) {

                        int[][] matriz = matrizTrans();
                        int[][] trans = insertarMult(matriz);
                        System.out.println("Matriz creada:");
                        imprimirMatriz(trans);
                        System.out.println("Ingrese el dato a buscar");
                        entrada = bufer.readLine();
                        int d = Integer.parseInt(entrada);
                        buscarElemento(d, trans);

                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 7:
                    while (!salir) {
                        int[][] A = {{6, 5, 8}, {3, 5, 8}, {5, 7, 3}};
                        System.out.println("Matriz 1: A = {{6, 5, 8}, {3, 5, 8}, {5, 7, 3}}");
                        System.out.println("");
                        if (matrizSimetrica(A)) {
                            System.out.println("La matriz es simetrica");
                        } else {
                            System.out.println("La matriz no es simetrica");
                        }
                        System.out.println("");
                        int[][] B = {{6,}, {2, 5, 3, 5, 8}, {5, 3}};
                        System.out.println("Matriz 2: B = {{6,}, {2, 5, 3, 5, 8}, {5,3}}");
                        System.out.println("");
                        if (matrizSimetrica(B)) {
                            System.out.println("La matriz es simetrica");
                        } else {
                            System.out.println("La matriz no es simetrica");
                        }
                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 8:
                    while (!salir) {
                        int[][] matriz = matrizTrans();

                        matrizIdentidad(matriz);

                        while (!salir) {
                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 9:
                    while (!salir) {
                        int[] A = matrizVec();
                        int[] R = insertarVec(A);
                        System.out.println("Matriz desordenada:");
                        mostrarVector(R);
                        System.out.println("");
                        bubbleSort(R);

                        System.out.println("");

                        while (!salir) {

                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 10:
                    while (!salir) {
                        int[] A = matrizVec();
                        int[] R = insertarVec(A);
                        System.out.println("Matriz desordenada:");
                        mostrarVector(R);
                        System.out.println("");
                        insercion(R);
                        System.out.println("");
                        while (!salir) {

                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 11:
                    while (!salir) {
                        int[] A = matrizVec();

                        System.out.println("Matriz creada");
                        System.out.println("");
                        while (!salir) {

                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 12:
                    while (!salir) {
                        int[] A = matrizVec();
                        int[] R = insertarVec(A);
                        System.out.println("Datos insertados en la matriz:");
                        mostrarVector(R);
                        while (!salir) {

                            int num = 0;
                            System.out.println("para repetir ingrese 1, para regresar al menu principal presione 2");
                            entrada = bufer.readLine();
                            num = Integer.parseInt(entrada);
                            if (num == 1) {
                                break;
                            } else if (num == 2) {
                                System.out.println("Bye");
                                salir = true;

                            } else {
                                System.out.println("ingrese una opcion valida");
                            }
                        }
                    }
                    break;
                case 13:
                    play = true;
                    break;
                default:
                    System.out.println("INGRESA UNA OPCIÓN VALIDA");
                    break;
            }

        } while (!play);

    }
}
