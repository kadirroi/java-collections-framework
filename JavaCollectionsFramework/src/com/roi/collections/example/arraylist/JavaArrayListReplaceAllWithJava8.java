package com.roi.collections.example.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class JavaArrayListReplaceAllWithJava8 {

	public static void main(String[] args) {

		// Defining a new list to append new elements
		List<String> countries = new ArrayList<>();
		countries.add("Turkey");
		countries.add("USA");
		countries.add("England");
		countries.add("Spain");

		CustomeUnaryOperator operator = new JavaArrayListReplaceAllWithJava8().new CustomeUnaryOperator();

		// UnaryOperator<E> operator
		// The old school way
		countries.replaceAll(operator);

		// Let's look at final status
		// [Turkey country, USA country, England country, Spain country]
		System.out.println(countries);

		// ReplaceAll was added in Java 1.8 and it is useful
		// method to make same action all of elements in this list
		// Using lambda expression
		countries.replaceAll(country -> {
			return "{" + country + "}";
		});

		// Let's look at final status
		// [{Turkey country}, {USA country}, {England country}, {Spain country}]
		System.out.println(countries);

	}

	class CustomeUnaryOperator implements UnaryOperator<String> {

		@Override
		public String apply(String t) {
			return t.concat(" country");
		}

	}

}
