package one.digitalinnovation.list;

import java.util.*;

public class ExercicioList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        for (String nome: nomes) {
            System.out.println(nome);
        }

        nomes.set(2, "Roberto");

        System.out.println(nomes);

        System.out.println(nomes.get(1));
        nomes.remove(4);
        nomes.remove("João");

        System.out.println(nomes);
        System.out.println(nomes.size());

        System.out.println(nomes.contains("Juliano"));

        List<String> novosNomes = new ArrayList<>();
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(nomes.isEmpty());

        System.out.println(nomes.indexOf("Diego"));

    }
}
