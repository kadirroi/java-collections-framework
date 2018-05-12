package com.roi.collections.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaListToArray {

	public static void main(String[] args) {
	   
	   //Initializing  a new java Array List
	   List<String>  teams = new ArrayList<String>();
       //Appending three elements to the list of teams proper sequence
	   teams.add("Barcelona");
       teams.add("Real Madrid");
       teams.add("Galatasaray");
       
       //Let's look at the all of elements in this list
       //[Barcelona, Real Madrid, Galatasaray]
       System.out.println(teams);
       
       //Initializing a new java array which is called as teamsAsArray
       String [] teamsAsArray = new String[teams.size()];
       //Using the method of list collection which is toArray to convert java list to array
       teamsAsArray = teams.toArray(teamsAsArray);
       //Let's look at the all of elements in this java array
       //[Barcelona, Real Madrid, Galatasaray]
       System.out.println(Arrays.toString(teamsAsArray));
	}

}
