package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Prog1","Prof. A.Gomez", List.of(
                new Estudiante("Cosme Fulanito", 20, "Tecnicatura en Programacion"),
                new Estudiante("Pepo Argenti", 49, "Tecnicatura en Programacion"),
                new Estudiante("Ricardo Bochini",30, "Tecnicatura en Programacion"),
                new Estudiante("Esteban Quito", 21, "Tecnicatura en Programacion")
        ));

        Curso c2 = new Curso("Prog2", "Prof. B.Gimenez",List.of(
                new Estudiante("Juan Perez", 20, "Tecnicatura en Programacion"),
                new Estudiante("Franco Rodriguez", 18, "Tecnicatura en Programacion"),
                new Estudiante("Michael Jackson",50, "Tecnicatura en Programacion"),
                new Estudiante("Hugh Jackman", 45, "Tecnicatura en Programacion")
        ));

        Curso c3 = new Curso("Prog3", "Prof. B.Gonzalez",List.of(
                new Estudiante("Keanu Reeves", 41, "Tecnicatura en Programacion"),
                new Estudiante("Johnny Deep", 43, "Tecnicatura en Programacion"),
                new Estudiante("Willy Wonka",39, "Tecnicatura en Programacion"),
                new Estudiante("Jack Sparrow", 42, "Tecnicatura en Programacion")
        ));

        System.out.println(c1 + "\n---------------------------------------");
        System.out.println(c2 + "\n---------------------------------------");
        System.out.println(c3 + "\n---------------------------------------");

    }
}