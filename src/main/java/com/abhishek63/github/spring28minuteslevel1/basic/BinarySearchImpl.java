package com.abhishek63.github.spring28minuteslevel1.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @PostConstruct
    public void postConstruct(){
       logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("predestroy in fun");
        logger.info("preDestroy");
    }

}
