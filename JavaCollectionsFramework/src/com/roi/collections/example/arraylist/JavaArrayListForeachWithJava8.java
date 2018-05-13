package com.roi.collections.example.arraylist;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class JavaArrayListForeachWithJava8 {

	public static void main(String[] args) {

        //Defining a new list to append  new elements
		List<String>  countries = new ArrayList<>();
		countries.add("Turkey");
		countries.add("USA");
		countries.add("England");
		countries.add("Spain");
		
		
		//the old school way
		//Turkey USA England Spain 
		CustomConsumer consumer = new JavaArrayListForeachWithJava8().new CustomConsumer();
		countries.forEach(consumer);
		
		System.out.println();
		
		//Foreach method was added in Java 1.8 and it is useful method
		//The method argument Consumer is a functional interface
		//Consumer<? super T> action
		//lambda expression way
		//Turkey USA England Spain 
		countries.forEach(country -> {System.out.print(country +" ");});
		
	}
	
	class CustomConsumer implements Consumer<String>{

		@Override
		public void accept(String country) {
			//Turkey USA England Spain 
	        System.out.print(country+" ");
			
		}
	}
}
