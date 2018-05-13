package com.roi.collections.example.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class JavaArrayListRemoveIfWithJava8 {

	public static void main(String[] args) {
	
		
               //Defining a new list to append  new elements
		List<String>  countries = new ArrayList<>();
		countries.add("Turkey");
		countries.add("USA");
		countries.add("England");
		countries.add("Spain");
			
		
		CustomPredicate filter = new JavaArrayListRemoveIfWithJava8().new CustomPredicate();	
		
		//Predicate<? super E> filter
		//The old school way
		countries.removeIf(filter);
		
		//Let's look at final status 
		//[USA, England, Spain]
		System.out.println(countries);
		
		//RemoIf was added in Java 1.8 and it is useful 
		//method to remove element with condition related filter 
		//Recommended way
		countries.removeIf(country -> {return "USA".equals(country);});
		
		//Let's look at final status 
		//[England, Spain]
		System.out.println(countries);
		

	}
	
	class CustomPredicate implements Predicate<String>{

		@Override
		public boolean test(String t) {
			return "Turkey".equals(t);
		}
		
	}

}
