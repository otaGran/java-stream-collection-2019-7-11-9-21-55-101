package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;

    }

    public List<Integer> filterEven() {
        Stream<Integer> stream1 = array.stream();
        return stream1.filter(v -> v %2==0)
                .collect(Collectors.toList());

    }

    public List<Integer> filterMultipleOfThree() {


        return array.
                stream()
                .filter(v -> v%3==0)
                .collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream()
                .filter(secondList::contains)
                .collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
        return array.stream()
                .distinct()
                .collect(Collectors.toList());

    }
}