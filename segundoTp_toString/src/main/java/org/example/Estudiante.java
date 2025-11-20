package org.example;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera=carrera;
    }

    public String getCarrera(){
        return carrera;
    }

    @Override
    public String toString() {
        return "\nNombre: " + this.getNombre() + "\nEdad: " + this.getEdad()+ "\nCarrera='" + carrera + "]";
    }
}
