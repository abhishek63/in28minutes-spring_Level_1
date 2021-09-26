package com.abhishek63.github.spring28minuteslevel1;

import com.abhishek63.github.spring28minuteslevel1.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring28minuteslevel1Application {

	public static void main(String[] args) {

//		SortingAlgo sortingAlgo = new BubbleSortAlgorithm();
//		sortingAlgo.sort()

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		binarySearch.searchElement(new int[] {1,2,4},2);

		 ApplicationContext applicationContext = SpringApplication.run(Spring28minuteslevel1Application.class, args);
		 BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);
		binarySearch1.setX(67);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch2 +" "+binarySearch2.getX());
		 binarySearch1.searchElement(new int[] {7,2,2,3},7);

		binarySearch2.searchElement(new int[] {7,2,2,3},7);

	}

}
