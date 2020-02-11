package com.victorlopez.Ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_NUM = 10;
        double[] nums = new double[MAX_NUM];
        double mayor;
        int numExcepcion = leerNumeros(nums);
        mayor = conseguirMayor1(nums);
        imprimirResultado(numExcepcion, mayor);
    }
    public static double conseguirMayor2(double[] n){
        double mayor = Double.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (mayor < n[i]){
                mayor = n[i];
            }
        }
        return mayor;
    }
    public static double conseguirMayor1(double[] n){
        Arrays.sort(n);
        return n[n.length-1];
    }
    public static void imprimirResultado(int nExcepciones, double mayor){
        System.out.println("La excepción se ha producido: " + nExcepciones);
        System.out.println("El número más alto de los insertados es: " + mayor);
    }
    public static int leerNumeros(double[] n){
        boolean validado;
        int contador = 0;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            do {
                try{
                    System.out.println("Introduce el número " + (i+1));
                    n[i] = Integer.parseInt(lector.nextLine());
                    validado = true;
                }catch (NumberFormatException nfe){
                    contador++;
                    validado = false;
                }
            }while(!validado);
        }
        return contador;
    }
}
