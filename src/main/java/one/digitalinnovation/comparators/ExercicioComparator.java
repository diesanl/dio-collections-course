package one.digitalinnovation.comparators;

import java.util.*;

public class ExercicioComparator {
    public static void main(String[] args) {

//        String[] paises = {"Argélia", "Austrália", "Canadá", "Geórgia", "Japão", "Montenegro", "Marrocos", "Nova Zelândia", "Ruanda", "Sérvia", "Coréia do Sul", "Tailândia", "Tunísia", "Uruguai", "China"};
//        List<String> paisesList = new ArrayList<>();
//
//        paisesList.addAll(Arrays.asList(paises));
//
//        System.out.println(paisesList);

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));
        estudantes.add(new Estudante("Manuela", 25));
        estudantes.add(new Estudante("Guilherme", 28));
        estudantes.add(new Estudante("Rafael", 31));
        estudantes.add(new Estudante("Marcela", 28));

        System.out.println("Ordem de inserção");
        System.out.println(estudantes);

        System.out.println("ordem alfabética usando lambda");
        estudantes.sort((first, second) -> first.getNome().compareTo(second.getNome()));
        System.out.println(estudantes);

        System.out.println("ordem alfabética reversa usando lambda");
        estudantes.sort((first, second) -> second.getNome().compareTo(first.getNome()));
        System.out.println(estudantes);

        System.out.println("ordem alfabética usando (method reference)");
        estudantes.sort(Comparator.comparing(Estudante::getNome));
        System.out.println(estudantes);

        System.out.println("ordem alfabética reversa usando (method reference)");
        estudantes.sort(Comparator.comparing(Estudante::getNome).reversed());
        System.out.println(estudantes);

        System.out.println("ordem de idade (interface Comparable)");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("ordem de idade reversa (interface Comparable)");
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println(estudantes);
    }
}
