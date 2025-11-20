package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> listaDeEstudiantes = new ArrayList<>(List.of(
                new Estudiante("Cosme Fulanito", 20, "Tecnicatura en Programacion"),
                new Estudiante("Pepo Argenti", 49, "Hincha de la Academia"),
                new Estudiante("Ricardo Bochini",30, "Leyenda del Rojo"),
                new Estudiante("Esteban Quito", 21, "Administración")
        ));

        System.out.println(listaDeEstudiantes);

    }
}