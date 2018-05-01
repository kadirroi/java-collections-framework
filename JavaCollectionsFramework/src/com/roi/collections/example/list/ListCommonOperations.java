package com.roi.collections.example.list;

import java.util.ArrayList;
import java.util.List;

public class ListCommonOperations {

	
	//Most common operations performed on java list are add ,remove
	//size ,get ,set ,clear etc.
	//Below is a simple java list example showing common method usage
	public static void main(String[] args) {
     
		//Let's create a new list which name is vowels
		List<String> vowels = new ArrayList<String>();
		
		//Appends the specified element to the end of list
		vowels.add("A");
		vowels.add("E");
		
		//Let's show all of elements in  this list  in proper sequence
	    System.out.println(vowels); //[A, E]
		
		//Let's insert I between A and E
		vowels.add(1, "I");
		
		//Let's show all of elements in  this list  in proper sequence
		System.out.println(vowels); //[A, I, E]
				
		//Let's create a new list which name is letters
		List<String> letters = new ArrayList<String>();
		
		//Add the specified element to the end of list of letters
		letters.add("O");
		letters.add("O");
		
		//appending list of letters to the end of list of vowels
		vowels.addAll(letters);
		
		//Let's show all of elements in list of vowels
		System.out.println(vowels);//[A, I, E, O, O]
		
		//Now let's remove all the elements from list of letters 
		letters.clear();
		
		//Let's show all of elements in the list of letters
		System.out.println(letters);//[]
		
		//to get the number of elements  in the list of vowels
		System.out.println("Size of list : "+vowels.size());//Size of list : 5
		
		//Replaces the element of the specified position in the list of vowels with
		//specified  element 
		vowels.set(0, "U");
		
		//Let's show all of elements in the list of vowels
		System.out.println(vowels);//[A, I, E, O, Ö] --> [U, I, E, O, O]
		
		//Let's clear  all  the elements from list of vowels
		vowels.clear();
		 
		//adding to element to list of vowels again
		vowels.add("A");
		vowels.add("E");
		vowels.add("U");
		vowels.add("O");
		vowels.add("O");
		
		//So let's show all the elements in this list
		System.out.println(vowels);//[A, E, U, O, O]
		
		//Showing sublist example
		//List<E> subList(int fromIndex, int toIndex)
		//Returns view of the portion of list between the specified fromIndex inclusive 
		//and toIndex exclusive
		//The returned list is backed by the list of vowels, 
		//so non structural changes  in the returned list are reflected to the list of vowels
		//So we have created object list which we have called letter before and we can use it 
		letters = vowels.subList(0, 2);
		
		//Let's showing  all of elements in the list of letters
		//vowels --> [A, E, U, O, O] letters(sublist) --> [A, E]
		System.out.println("vowels --> " + vowels +" letters(sublist) --> "+ letters);
		
		//Let's  replaces the element  of the specified position in the list of vowels 
		//with specified element, example  set the first element in the list f vowels  with letter of "I"
		vowels.set(0, "I");
		
		//Let's now showing all of element in this list
		//vowels --> [I, E, U, O, O] letters(sublist) --> [I, E] cause letters is backed by the list of vowels  
		System.out.println("vowels --> " + vowels +" letters(sublist) --> "+ letters);
		
		//Let's add  a new element between 'E' and 'U'
		//When Performing structural changes in the list of vowels
		//we can get exception which is  "java.util.ConcurrentModificationException"
		//so we shouldn't performed structural change on the list of vowels which is main list in my example
		//vowels.add("E");
		
		//Let's now showing all of element in this list
		//vowels --> [I, E, U, O, O] letters(sublist) --> [I, E] cause letters is backed by the list of vowels  
		//System.out.println("vowels --> " + vowels +" letters(sublist) --> "+ letters);
		
		//Now let's try to add  a new element in the list of letters
		letters.add("E");
		
		//Let's now showing all of element in this list
		//vowels --> [I, E, E, U, O, O] letters(sublist) --> [I, E, E] 
		//cause letters is backed by the list of vowels  
		//Structural modification to returned list is working well and reflecting in the list of vowels and letter altogether
		System.out.println("vowels --> " + vowels +" letters(sublist) --> "+ letters);
	}
}
