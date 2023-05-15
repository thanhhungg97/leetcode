package org.example.sorted;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    void quickSort(int[] array) {
        partition(array, 0, array.length - 1);
    }

    void partition(int[] array, int left, int right) {
        if (left >= right) {
        }
        int pivot = array[left];
        List<Integer> lessThanPivot = new LinkedList<>();
        List<Integer> greaterThanPivot = new LinkedList<>();
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < pivot) {
                lessThanPivot.add(array[i]);
            } else {
                greaterThanPivot.add(array[i]);
            }
        }
        for (int i = 0; i < lessThanPivot.size(); i++) {
            array[i + left] = lessThanPivot.get(i);
        }
        array[lessThanPivot.size()] = pivot;
        for (int i = 0; i < greaterThanPivot.size(); i++) {
            array[i + lessThanPivot.size() + 1 + left] = greaterThanPivot.get(i);

        }

        partition(array, left, lessThanPivot.size() - 1);
        partition(array, lessThanPivot.size() + 1, right);


    }


    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 5, 4};
        Sorted sorted = new Sorted();

        sorted.quickSort(array);
        System.out.println(array);

    }
}
