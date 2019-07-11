package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        if(left > right)

            return IntStream.rangeClosed(Math.min(left, right), Math.max(left, right))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        else
            return IntStream.rangeClosed(Math.min(left, right), Math.max(left, right))
                    .boxed()
                    .sorted()
                    .collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left > right)

            return IntStream.rangeClosed(Math.min(left, right), Math.max(left, right))
                    .filter(v -> v%2==0)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        else
            return IntStream.rangeClosed(Math.min(left, right), Math.max(left, right))
                    .filter(v -> v%2==0)
                    .boxed()
                    .sorted()
                    .collect(Collectors.toList());

    }

    public List<Integer> popEvenElments(int[] array) {
        Stream<Integer> stream1 = Arrays.stream(array).boxed();

        return stream1
                .filter(v -> v%2==0)
                .collect(Collectors.toList());

    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
