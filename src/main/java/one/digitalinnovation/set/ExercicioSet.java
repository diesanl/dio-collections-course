package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numerosSet = new LinkedHashSet<>();

        Set<Integer> teste = new HashSet<>();
        teste.add(null);
        System.out.println(teste);
        teste.add(2);
        System.out.println(teste);


        numerosSet.add(3);
        System.out.println(numerosSet);
        numerosSet.add(88);
        System.out.println(numerosSet);
        numerosSet.add(20);
        System.out.println(numerosSet);
        numerosSet.add(44);
        System.out.println(numerosSet);
        numerosSet.add(3);
        System.out.println(numerosSet);

        numerosSet.add(23);
        System.out.println(numerosSet);

        System.out.println(numerosSet.remove(3));
        System.out.println(numerosSet);

        System.out.println(numerosSet.size());

        System.out.println(numerosSet.isEmpty());

    }
}
