package one.digitalinnovation.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {

        Queue<String> umaFila = new LinkedList<>();
        umaFila.add("Juliana");
        umaFila.add("Pedro");
        umaFila.add("Carlos");
        umaFila.add("Larissa");
        umaFila.add("João");

        System.out.println("Na fila: " + umaFila);

        for (String cliente : umaFila) {
            System.out.println("Cliente na fila " + cliente);
        }

        System.out.println("Sem remover 1st cliente: " + umaFila.element());
        System.out.println("Remover 1st cliente: " + umaFila.poll());
        System.out.println("Na fila: " + umaFila);

        umaFila.add("Daniel");

        System.out.println("Na fila: " + umaFila);

        System.out.println("Size: " + umaFila.size());
        System.out.println("isEmpty? " + umaFila.isEmpty());
        System.out.println("Contém Carlos? " + umaFila.contains("Carlos"));

    }
}
