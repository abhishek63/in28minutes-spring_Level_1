package com.abhishek63.github.spring28minuteslevel1.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortingAlgo{

    public int[] sort(int arr[]){

        return arr;
    }
}
