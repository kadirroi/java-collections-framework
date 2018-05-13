package com.roi.collections.example.arraylist;

import java.util.ArrayList;

public class JavaArrayListCommonOperations {

	public static void main(String[] args) {
		
		//Initializing  new array list with initial capacity as 10
		ArrayList<String> teams = new ArrayList<>();
		
		//let's insert four teams in Europe :)
		teams.add("Galatasaray");
		teams.add("Real madrid");
		teams.add("Barcelona");
		teams.add("Liverpool");
		
		//let's insert Roma between Barcelona and Real Madrid as a new team
		teams.add(2, "Roma");
		
		//Let's show all off elements in this list
		System.out.println(teams);
		
		//Let's define new array list for second group
		ArrayList<String>  teamsGroupB = new ArrayList<>();
		teamsGroupB.add("Milan");
		teamsGroupB.add("Manchester United");
		
		//Let's show all off elements in this list
		System.out.println(teamsGroupB);
		
		//Appending teams in the list of teamsGroupB to teams
		teams.addAll(teamsGroupB);
		
		//Let's show all off elements in this list
	    System.out.println(teams);
		
	    
	    //Remove all of elements from teamsGroupB
	    teamsGroupB.clear();
	    
	    //adding new eleemnts to the list of teamsGroupB
	    teamsGroupB.add("Malaga");
	    teamsGroupB.add("Ajax");
		
		
	    //Let's show all off elements in this list
	    System.out.println(teamsGroupB);
		
		
	    //inserting list to the list
	    teams.addAll(3, teamsGroupB);
		
	    //Let's show all off elements in this list
	    System.out.println(teams);
		
	    //Teams list contains Sevilla?
	    System.out.println(teams.contains("Sevilla"));
		
	    //Teams list contains Barcelona?
	    System.out.println(teams.contains("Barcelona"));
	}
	
}
