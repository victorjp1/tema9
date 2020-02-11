package com.victorlopez.Ejercicio03;

import java.util.Scanner;

public class Main {
    static Scanner lector;

    public static void main(String[] args) {
        final int MAX_ARRAY = 500;
        double[] numeros = new double[MAX_ARRAY];//Variable que almacenará el número
        lector = new Scanner(System.in);//Declaramos el escáner
        double mayor;
        int contador;//Contador para las posiciones que hay válidas en el array.
        contador = leerNumeros(numeros);//Leemos números y modificamos el array y devolvemos el contador.
        if (contador == 0){
            System.out.println("No se ha introducido ningún número");
        }else{
            mayor = conseguirMayor2(numeros, contador);
            System.out.println("El mayor número introducido es: " + mayor);
        }
    }

    /**
     * Método para leer números, validándolos
     * @param n array a llenar
     * @return devolvemos el número de elementos a iterar
     */
    private static int leerNumeros(double[] n){
        boolean letra = false;
        int contador = 0;
        boolean isFull;
        do{
            try{
                System.out.println("Introduce un números positivos:");
                System.out.println("Cuando introduzcas un letra el programa mostrará el número más alto introducido");
                n[contador] = Double.parseDouble(lector.nextLine());
                contador++;
            }catch (NumberFormatException nfe){//Atrapamos la excepción
                letra = true;
            }
            isFull = n.length == contador;
        }while(!letra && !isFull);
        if (isFull){
            System.out.println("No es posible almacenar más números");
        }
        return contador;
    }

    /**
     * Método para conseguir el número mayor
     * @param n array a valorar
     * @param contador numero de elementos a iterar
     * @return devolvemos el número mayor
     */
    public static double conseguirMayor2(double[] n, int contador){
        double mayor = Double.MIN_VALUE;
        for (int i = 0; i < contador; i++) {
            if (mayor < n[i]){
                mayor = n[i];
            }
        }
        return mayor;
    }
}
