package com.victorlopez.Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_ARRAY = 5;
        int[] nums = new int[MAX_ARRAY];
        int contador;
        int[] prueba = null;
        contador = leerNumeros(nums);
        imprimirNumeros(nums, contador);
        leerNumeros(prueba);
    }

    /**
     * Método que imprime números de un array
     * @param a array a imprimir
     * @param contador num de posiciones a imprimir
     */
    private static void imprimirNumeros(int[] a, int contador){
        for (int i = 0; i < contador ; i++) {
            System.out.println("El número " + (i+1) + " es: " + a[i]);
        }
    }

    /**
     * Método para leer números
     * @param n array para almacenar los números
     * @return devolvemos un contador para saber sobre que elementos iterar
     */
    private static int leerNumeros(int[] n){
        boolean validado;
        Scanner lector = new Scanner(System.in);
        int contador = 0;
        boolean salir = false;
        do{
            do{
                try{
                    System.out.println("Introduce un números:");
                    n[contador] = Integer.parseInt(lector.nextLine());//Leemos el número
                    contador++;
                    validado = true;
                }catch (NumberFormatException nfe){//Atrapamos la excepción de conversión a numeros
                    validado = false;//No está validado
                    System.out.println("Solo números por favor");
                }catch (ArrayIndexOutOfBoundsException aiob){//Atrapamos la excepción de out of bounds
                    System.out.println("No es posible almacenar más números");
                    salir = true;
                    validado = true;
                }catch (NullPointerException npe){//Si el array está a null, capturamos la excepcion
                    System.out.println("El array no ha sido inicializado");
                    salir = true;
                    validado = true;
                }
            }while(!validado);

        }while(!salir);
        return contador;
    }
    private static boolean isFull(int[] a, int contador){
        return a.length == contador;
    }
}
