package com.abhishek63.github.spring28minuteslevel1.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    private SortingAlgo sortingAlgo ;
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public BinarySearchImpl(SortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
    }

    public int searchElement(int arr[] , int searchTo){
        //sorting algorithm
        int result[] = sortingAlgo.sort(arr);
        System.out.println(sortingAlgo);
        return 3;
    }


}
