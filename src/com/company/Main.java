package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {1,2,34,6,8,4,23,7};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
