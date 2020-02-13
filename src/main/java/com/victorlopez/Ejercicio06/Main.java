package com.victorlopez.Ejercicio06;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        double resultados[];
        int[] array = {-2,-1,0,1,2};
        int valor;
        valor = pedirValor(lector);
        resultados = dividirEntreArray(valor,array);
        imprimirResultados(resultados);
    }
    public static void imprimirResultados(double[] resultados){
        for (int i = 0; i < resultados.length ; i++) {
            System.out.println("El resultado de la operación " + (i+1) + " es: " + resultados[i]);
        }
    }
    public static int pedirValor(Scanner lector){
        int valor;
        do{
            System.out.println("Introduce un valor:");
            valor = Integer.parseInt(lector.nextLine());
            if(valor==0){
                System.out.println("El valor no puede ser 0.");
            }
        }while(valor==0);
        return valor;
    }
    public static double[] dividirEntreArray(int valor, int[] array){
        double[] resultados = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try{
                resultados[i]=valor/array[i];
            }catch(ArithmeticException e1){
                System.out.println("No es posible dividir por 0");
            }
        }
        return resultados;
    }
}
