package com.roi.collections.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayToList {

	public static void main(String[] args) {
		
		
		//initializing the variable of teams
		String [] teams = {"Barcelona" ,"Real Madrid" ,"Galatasaray" ,"Bayer München"};
		
		//Let's show all of element in the array of teams in proper sequence
		//[Barcelona, Real Madrid, Galatasaray, Bayer München]
		System.out.println(Arrays.toString(teams));
		
		//We can use Arrays Class to get view of array as list
		List<String> teamsAslist =Arrays.asList(teams);
		
		//Let's show all of element in this list
		//[Barcelona, Real Madrid, Galatasaray, Bayer München]
		System.out.println(teamsAslist);
		
		
		//the List of teamAsList is backed by array ,so we can't do structural modification
		//Both of the below statements wil be throw java.lang.UnsupportedOperationException
		try {
			teamsAslist.add("Liverpool");
			teamsAslist.remove(5);
			teamsAslist.clear();
		} catch (UnsupportedOperationException e) {
			//Let's show exception
			//java.lang.UnsupportedOperationException
			System.out.println(e);
		}
		
		
		//using for loop to copy elements of array to list ,safe for modification of list
		//Let's create  a new list to copy elements from teams to list
		
		List<String>  newList = new ArrayList<>();
		
		
		for (int i = 0; i < teams.length; i++) {
		    newList.add(teams[i]);  	
		}
		//Let's display all of elements in this list
		System.out.println(newList);
		
		//And the new list is not backed by the array so we can do any structural modification over the list
		//we wont get any exception releated non structual modification cause as I said befoe we have copied
		//all of element from teams array to new list so the new list isn't backed by array 
	    //Appending a new element to list
		newList.add("Liverpool");
	    
	    //Let's display all of elements in this list now
		//[Barcelona, Real Madrid, Galatasaray, Bayer München, Liverpool]
	    System.out.println(newList);
	    
	    //Remeoves all of elemnts from this list
		newList.clear();
		
	    //Let's display all of elements in this list now
		//[]
	    System.out.println(newList);
	}

}
