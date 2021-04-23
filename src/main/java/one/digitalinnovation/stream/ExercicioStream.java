package one.digitalinnovation.stream;

import one.digitalinnovation.comparators.Estudante;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioStream {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();
        List<String> frutas = Arrays.asList("Maçã", "Laranja", "Banana", "Limão");

//        System.out.println(frutas.stream().min(Comparator.comparingInt(String::length)));

//        System.out.println(frutas.stream().collect(Collectors.groupingBy(fruta -> fruta.substring(0, 1))));

        // Adiciona estudantes para a coleção
        estudantes.add(new Estudante("Pedro", 30));
        estudantes.add(new Estudante("Thayse", 31));
        estudantes.add(new Estudante("Marcelo", 25));
        estudantes.add(new Estudante("Carla", 26));
        estudantes.add(new Estudante("Juliana", 27));
        estudantes.add(new Estudante("Thiago", 28));
        estudantes.add(new Estudante("Rafael", 24));

        //1
        System.out.println("1-- Coleção estudantes c nome + idade: " + estudantes.stream()
                .map(estudante -> estudante.getNome()
                        .concat(" - ")
                        .concat(String.valueOf(estudante.getIdade()))
                ).collect(Collectors.toList())
        );

        System.out.println("//2");
        estudantes.stream().forEach(System.out::println);

        System.out.println("//3.1-- " + estudantes.stream()
                .filter(estudante -> estudante.getIdade() >= 30)
                .collect(Collectors.toList()));

        System.out.println("//4--");
        estudantes.stream().forEach(System.out::println);

        System.out.println("//5--");
        System.out.println("//5--" + estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.getNome())
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("c"))
                .collect(Collectors.toList()));

        System.out.println("//6--"+ estudantes.stream().anyMatch(estudante -> estudante.getNome().contains("d")));

        System.out.println("//7-- " +estudantes.stream().max(Comparator.comparingInt(value -> value.getIdade())));

    }
}
