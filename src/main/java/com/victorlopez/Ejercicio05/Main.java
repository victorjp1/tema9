package com.victorlopez.Ejercicio05;

import java.util.Scanner;

public class Main {
    static Scanner lector;
    static boolean validado;
    public static void main(String[] args) {
        final int MAX_ARRAY = 500;
        int contador = 0;
        lector = new Scanner(System.in);
        Alumno alumno1 = crearAlumno();
        Alumno alumno2 = crearAlumno();
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        imprimirMayor(alumno1, alumno2);
    }

    /**
     * Método que compara dos alumnos y imprime quien es mayor
     * @param a alumno1 a comparar
     * @param a2 alumno2 a comparar
     */
    private static void imprimirMayor(Alumno a, Alumno a2){
        if (a.getEdad() > a2.getEdad()){
            System.out.println("El alumno " + a.getNombre() + " es mayor al alumno " + a2.getNombre());
        }else if(a.getEdad() == a2.getEdad()){
            System.out.println("Los dos alumnos tienen la misma edad");
        }else{
            System.out.println("El alumno " + a2.getNombre() + " es mayor al alumno " + a.getNombre());
        }
    }

    /**
     * Método para crear un alumno
     * @return devolvemos un alumno
     */
    private static Alumno crearAlumno(){
        String nombre;//Variable para almacenar el nombre del alumno
        int edad;//Variable para almacenar la edad del alumno
        double altura; //Variable para almacenar la altura del alumno
        nombre = pedirNombre();//El método nos devuelve el nombre ya validado
        edad = pedirEdad();//Nos devuelve la edad ya validada
        altura = pedirAltura();//Nos devuelve la altura ya validada
        Alumno a = new Alumno(nombre, edad, altura);//Creamos un nuevo alumno
        return a;//Devolvemos el nuevo alumno
    }

    /**
     * Método que pide el nombre del alumno y lo valida
     * @return devolvemos el nombre ya validado
     */
    private static String pedirNombre(){
        String nombre;
        do {
            System.out.println("Introduce el nombre del alumno: ");
            nombre = lector.nextLine();
            validado = true;
            if (nombre.length() < 3){
                validado = false;
                System.out.println("El nombre debe tener mínimo 3 caracteres");
            }else{
                validado = true;
            }
        }while(!validado);
        return nombre;
    }

    /**
     * Método para pedir la edad del alumno
     * @return devolvemos la edad ya validada
     */
    private static int pedirEdad(){
        int edad = 0;
        do {
            do {
                try{
                    System.out.println("Introduce la edad del alumno: ");
                    edad = Integer.parseInt(lector.nextLine());
                    validado = true;
                }catch (NumberFormatException nfe){
                    validado = false;
                    System.out.println("Solo números por favor");
                }
            }while(!validado);
            if (edad < 0 && edad > 150){
                validado = false;
                System.out.println("La edad debe ser un entero positivo");
            }else{
                validado = true;
            }
        }while(!validado);
        return edad;
    }

    /**
     * Método para pedir y validar la altura del alumno
     * @return devolvemos la altura ya validada
     */
    private static double pedirAltura(){
        double altura = 0;
        do {
            do {
                try{
                    System.out.println("Introduce la altura del alumno: [metros]");
                    altura = Double.parseDouble(lector.nextLine());
                    validado = true;
                }catch (NumberFormatException nfe){
                    validado = false;
                    System.out.println("Solo números por favor");
                }
            }while(!validado);
            if (altura < 0 && altura > 3){
                validado = false;
                System.out.println("La altura debe ser un número positivo");
            }else{
                validado = true;
            }
        }while(!validado);
        return altura;
    }

}
