package one.digitalinnovation.optionals;

import com.google.common.cache.RemovalListener;
import org.checkerframework.checker.nullness.Opt;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;

public class ExercicioOptional {
    public static void main(String[] args) {

        Optional<Integer> optionalInteger = Optional.of(1500);
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalPresente = Optional.of("Estado Presente");
        // o nullable apresenta empty caso o optional seja null, n dando NPE
        Optional<Object> optionalNull = Optional.ofNullable(null);


        OptionalDouble od = OptionalDouble.of(25.5);
        System.out.println("TESTWE"+od.getAsDouble());

//        System.out.println("optionalInteger: " + optionalInteger);
//        System.out.println("optionalEmpty: " + optionalEmpty);
//        System.out.println("optionalPresente: " + optionalPresente);
//        System.out.println("optionalNull: " + optionalNull);


        if (optionalInteger.isPresent()) {
            System.out.println("1-- optionalInteger: " + optionalInteger);
        }

//        System.out.println("2-- optionalEmpty: "+ optionalEmpty.orElseThrow(IllegalStateException::new));

//        optionalString.ifPresentOrElse(System.out::println,
//                () -> System.out.println("Valor não está presente"));
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("3-- Optional Vazio"));

        optionalInteger.ifPresentOrElse(System.out::println, () -> System.out.println("4-- Optional Integer vazio"));

        if (optionalInteger.isPresent()) {
            //praticing lambda
            Consumer<Object> c = x -> System.out.println(x);
            c.accept("5-- " + optionalInteger.get());
            //OR
            System.out.println("5-- " + optionalInteger.get());
        }

    }
}
