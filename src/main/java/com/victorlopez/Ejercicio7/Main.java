package com.victorlopez.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        String[] cadenas = {"hola", "adios", "hasta luego",null};
        mostrarInicial(cadenas);
    }
    public static void mostrarInicial(String[] a){
        for (int i = 0; i < a.length ; i++) {
            try{
                System.out.println(a[i].charAt(0));
            }catch(NullPointerException npe){
                System.out.println("El valor es nulo");
            }
        }
    }
}
