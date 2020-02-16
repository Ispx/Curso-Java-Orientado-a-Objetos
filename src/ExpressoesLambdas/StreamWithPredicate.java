package ExpressoesLambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//Interface funcional
public class StreamWithPredicate {
	/*
	A interface Predicate possui apenas o metodo test que retorna um valor booleano true/false
	dado uma expressão lambda.
	 */

    interface UndestendPredicate extends Predicate {
    }

    static void Undestend(List<Integer> list, UndestendPredicate predicate) {

        list.stream().filter(x -> predicate.test(x) == true).forEach(x -> System.out.println(x));
    }

    static void filterNoStream(List<String> list, Predicate<String> predicate) {

        list.forEach(x -> {
            if (predicate.test(x) == true) {
                System.out.println(x);
            }
            ;
        });
    }

    static void filterWithStream(List<String> list, Predicate<String> predicate) {

        list.stream().filter(element -> predicate.test(element)).forEach(element -> System.out.println(element));
    }


    static void filterNumbers(List<Integer> list, Predicate predicate) {
        list.stream().filter(element -> predicate.test((Integer) element)).forEach(element -> System.out.println(element));
    }

    static void numbersDistinct(List<Integer> list) {
        list.stream().distinct();
    }

    static void numbersDistinctOrder(List<Integer> list) {
        Collections.sort(list);
        list.stream().distinct().forEach(x -> System.out.println(x));
    }


    static void filterWithStream(List list) {
        System.out.println(list.stream().findFirst());
    }


    public static void main(String[] args) {

        List<String> capital = Arrays.asList("S�o Paulo", "Belo Horizonte", "Santa Catarina", "Rio de Janeiro", "Vit�ria", "Palmas", "Acre", "Curitiba", "Distrito Federal", "Salvador", "Manaus");
        List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 7, 9, 9, 10, 8, 9, 10, 11, 12);


        //filterNoStream(capital, word -> word.endsWith("o"));


        //Geting the first element of the collection
        filterWithStream(capital);


        //Printing the elements of the collection, second the predicate
        System.out.println("------------------------------");
        filterWithStream(capital, word -> word.endsWith("a"));


        System.out.println(" \n\n\n");

        filterNumbers(numbers, x -> (int) x > 5 && (int) x < 12);
        System.out.println();


        System.out.println("distinct in order ");
        numbersDistinctOrder(numbers);

        System.out.println("Undestend Interface Predicate");
        Undestend(numbers, x -> (int) x > 2);


    }

}
