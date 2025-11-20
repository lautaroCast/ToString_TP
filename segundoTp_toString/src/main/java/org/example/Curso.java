package org.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nombre;
    String profesor;
    List<Estudiante>listaDeEstudiantes = new ArrayList<>(List.of());

    public Curso(String nombre, String profesor, List<Estudiante> listaDeEstudiantes) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso: " + nombre +
                "\nProfesor: " + profesor +
                "\nLista De Estudiantes: " + listaDeEstudiantes;
    }
}
