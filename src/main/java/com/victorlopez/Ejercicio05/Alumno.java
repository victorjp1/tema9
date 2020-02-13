package com.victorlopez.Ejercicio05;

public class Alumno {
    private String nombre;
    private int edad;
    private double altura;

    /**
     * Constructor de la clase alumno
     * @param nombre nombre del alumno
     * @param edad edad del alumno
     * @param altura altura en cm del alumno
     */
    public Alumno(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    /**
     * Método para imprimir los datos de los alumnos
     * @return devuelve un String compuesto por los datos del alumno
     */
    @Override
    public String toString() {
        String aux = "";
        aux += "Nombre: " + getNombre() + "\n";
        aux += "Edad: " + getEdad() + "\n";
        aux += "Altura: " + getAltura() + "\n";
        return aux;
    }

    /**
     * Método que devuelve el nombre del alumno
     * @return Strin que contiene el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para cambiar el nombre del alumno
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la edad del alumno
     * @return devolvemos la edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para cambiar la edad del alumno
     * @param edad edad a cambiar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener la altura del alumno
     * @return devolvemos la altura del alumno
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método para cambiar la altura del alumno
     * @param altura altura a cambiar
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
