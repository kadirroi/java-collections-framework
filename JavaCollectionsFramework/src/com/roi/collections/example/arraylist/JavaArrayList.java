package com.roi.collections.example.arraylist;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {

	public static void main(String[] args) {

		//Java array list is almost similar to vector except that
		//it's unsynchronized so we can say that 
		//the performance of the java array list is better than the vector in single
		//thread environment
		
		//This is not recommended way defining array list in java
		List listnotrecommend = new ArrayList<>();
		
		//Defining recommend way array list in java
		List<String> listrecommend = new ArrayList<>();
		
	        //There are three constructors in Java array list class
		
		//Let's do java array list default constructor
		//default capacity is defined as 10
		ArrayList<String> friends = new ArrayList<>();
		
		
		//We can define initial capacity of array list later calling 
		//the method of  ensureCapacity
                friends.ensureCapacity(1000);
		
		//Now let's  define java array list  constructor with initial capacity
		//now we have defined default capacity as 5000 for this list
		List<String> famousList = new ArrayList<>(5000);
		
		//Let's add three elements to this list in order
		famousList.add("John");
		famousList.add("Brad");
		famousList.add("Tom");
		
		//Let's show all of elements in this list
		//[John, Brad, Tom]
		System.out.println(famousList);
		
		//Creating anew list from different collection source
		List<String> famousListNew = new ArrayList<>(famousList);
		
		//Let's append a new element to list
		famousListNew.add("Nicolas");
		
		//Let's show all of elements in this list
		//[John, Brad, Tom, Nicolas]
		System.out.println(famousListNew);
			
	}

}
