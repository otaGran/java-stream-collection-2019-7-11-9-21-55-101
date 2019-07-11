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
        throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        throw new NotImplementedException();
    }
}