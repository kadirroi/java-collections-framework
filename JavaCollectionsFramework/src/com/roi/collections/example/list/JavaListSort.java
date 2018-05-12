package com.roi.collections.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JavaListSort {

	
	//There are two ways  to sort  a list
	//Using collection class for natural sorting 
	//or using the sort  method of list  with own comparator for sorting 
	public static void main(String[] args) {
	   
		//initializing length of for loop
		final int LENGTH =5;
		
		//Let's do initialize  a new list
		List<Integer>  randomNumbersList = new ArrayList<>();
		//Using Ramndom method and for loop to append a new element to  the list of randomNumberlist
		Random random = new Random();
		for (int i = 0; i < LENGTH  ; i++)
			randomNumbersList.add(random.nextInt(5000));
			
		//Let's display all of elemnts in this list
		//[4221, 4966, 11, 4300, 409]
		System.out.println(randomNumbersList);
		
		
		//Let's use collection class for natural sortin
		Collections.sort(randomNumbersList);
		
		//Let's look all of elements in this list
		//[11, 409, 4221, 4300, 4966]
		System.out.println(randomNumbersList);
		
		
		//Let's  use the sort method of  list for reverse sorting 
		randomNumbersList.sort((s1 ,s2) -> {return (s2-s1);});
		
		//Let's show all of elemnts in this list
		//[4966, 4300, 4221, 409, 11]
		System.out.println(randomNumbersList);

	}

}
