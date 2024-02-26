package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "John", "Alice");
        String filteredResult = NameSort.filterNames(names);
        System.out.println("Filtered names: " + filteredResult);

        List<String> sortedNames = NameSort.sortNames(names);
        System.out.println("Sorted names: " + sortedNames);

        String[] arrays = {"1, 2, 0", "4, 5"};
        String sortedNumbers = NameSort.sortNumbers(arrays);
        System.out.println("Sorted numbers: " + sortedNumbers);

        System.out.println("-----");
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 1L;
        NameSort.linearCongruentialGenerator(seed, a, c, m)
                .limit(10)
                .forEach(x -> System.out.println("Linear Congruential Generator: " + x));
        System.out.println("-----");


        Supplier<Stream<Integer>> firstStreamSupplier = () -> Stream.of(1, 2, 3, 4, 5);
        Supplier<Stream<Integer>> secondStreamSupplier = () -> Stream.of(6, 7, 8, 9, 10);

        Stream<Integer> zippedStream = NameSort.zip(firstStreamSupplier.get(), secondStreamSupplier.get());
        zippedStream.forEach(System.out::println);
    }
}