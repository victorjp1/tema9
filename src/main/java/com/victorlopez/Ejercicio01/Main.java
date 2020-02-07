package com.victorlopez.Ejercicio01;
import java.util.Scanner;

public class Main {
    static Scanner lector;
    public static void main(String[] args) {
        final int MAX_ARRAY = 500;
        int[] numeros = new int[MAX_ARRAY];//Variable que almacenará el número
        lector = new Scanner(System.in);//Declaramos el escáner
        int contador;//Contador para las posiciones que hay válidas en el array.
        contador = leerNumeros(numeros);//Leemos números y modificamos el array y devolvemos el contador.
        imprimirNumeros(numeros, contador);//Imprimimos todos los números introducidos por el user.
    }
    private static void imprimirNumeros(int[] n, int contador){
        System.out.println("Números introducidos: ");
        for (int i = 0; i < contador ; i++) {
            if (n[i] >= 0){
                System.out.println("Número " + (i+1));
                System.out.println(n[i]);
            }
        }
    }
    private static boolean isNegativo(int numero){
        return numero < 0;
    }
    private static int leerNumeros(int[] n){
        boolean validado;
        int contador = 0;
        boolean negativo = false;
         do{
            do{
                try{
                    System.out.println("Introduce un números positivos:");
                    System.out.println("Cuando introduzcas un número negativo terminará el programa");
                    n[contador] = Integer.parseInt(lector.nextLine());//Leemos el número
                    negativo = isNegativo(n[contador]);
                    contador++;
                    validado = true;
                }catch (NumberFormatException nfe){//Atrapamos la excepción
                    validado = false;//No está validado
                    System.out.println("Solo números por favor");
                }
            }while(!validado);
        }while(!negativo && !isFull(n, contador));
        if (isFull(n, contador)){
            System.out.println("No es posible almacenar más números");
        }
        return contador;
    }
    private static boolean isFull(int[] a, int contador){
        return a.length == contador;
    }
}
