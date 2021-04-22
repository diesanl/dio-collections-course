package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.TreeMap;

public class ExercicioMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeEstados = new TreeMap<>();
        treeEstados.put("AC", "Acre");
        treeEstados.put("AL", "Alagoas");
        treeEstados.put("AP", "Amapá");
        treeEstados.put("AM", "Amazonas");
        treeEstados.put("BA", "Bahia");
        treeEstados.put("CE", "Ceará");
        treeEstados.put("ES", "Espírito Santo");
        treeEstados.put("GO", "Goiás");
        treeEstados.put("MA", "Maranhão");
        treeEstados.put("MT", "Mato Grosso");
        treeEstados.put("MS", "Mato Grosso do Sul");
        treeEstados.put("MG", "Minas Gerais");
        treeEstados.put("PA", "Pará");
        treeEstados.put("PB", "Paraíba");
        treeEstados.put("PR", "Paraná");
        treeEstados.put("PE", "Pernambuco");
        treeEstados.put("PI", "Piauí");
        treeEstados.put("RJ", "Rio de Janeiro");
        treeEstados.put("RN", "Rio Grande do Norte");
        treeEstados.put("RS", "Rio Grande do Sul");
        treeEstados.put("RO", "Rondônia");
        treeEstados.put("RR", "Roraima");
        treeEstados.put("SC", "Santa Catarina");
        treeEstados.put("SP", "São Paulo");
        treeEstados.put("SE", "Sergipe");
        treeEstados.put("TO", "Tocantins");

        System.out.println(treeEstados);

        System.out.println("1- " + treeEstados.remove("MG"));
        ;

        System.out.println(treeEstados);
        System.out.println("2- " + treeEstados.put("DF", "Distrito Federal"));
        ;
        System.out.println(treeEstados);

        System.out.println("3- " + treeEstados.size());

        System.out.println("4- " + treeEstados.remove("MS", "Mato Grosso do Sul"));
        ;
        System.out.println(treeEstados);

        Iterator<String> iteratorEstados = treeEstados.keySet().iterator();

        while (iteratorEstados.hasNext()) {
            String siglaEstado = iteratorEstados.next();
            System.out.println("5- " +treeEstados.get(siglaEstado) + "(" + siglaEstado + ")");
        }

        System.out.println("6- " + treeEstados.containsKey("SC"));

        System.out.println("7- " + treeEstados.containsValue("Maranhão"));


    }
}
