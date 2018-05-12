package com.roi.collections.example.list;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class JavaListIterator {

	public static void main(String[] args) {

		// Initializing new java ArrayList
		List<Integer> randomListNumber = new ArrayList<>();
		// Using Random Class to create random number to append to the list of
		// randomListNumber
		Random random = new Random();
		// Appending a new element to this list
		for (int i = 0; i < 5; i++)
			randomListNumber.add(random.nextInt(500));

		// Let's show all of the element in this list
		// [351, 325, 486, 316, 305]
		System.out.println("\n" + randomListNumber);

		// returns a list iterator over the elements in this list
		Iterator<Integer> iterator = randomListNumber.iterator();
		// Let's use iterator
		while (iterator.hasNext()) {
			int ramdomNumber = (int) iterator.next();
			// Let's show each element after iteration until the iteration over the list has
			// terminated
			// 351,325,486,316,305,
			System.out.print(ramdomNumber + ",");
		}
		// After the iteration over the list let's show all of elements in this list
		// cause is there any modification over the list to check
		// [351, 325, 486, 316, 305]
		System.out.println("\n" + randomListNumber);

		// Let's call iterator method over the list
		iterator = randomListNumber.iterator();
		// we can remove any element in any collection using iterator
		while (iterator.hasNext()) {

			int randomnumber = (int) iterator.next();
			if ((randomnumber % 2) == 0)
				iterator.remove();

		}
		// After the iterator over the list is terminated, Let's look the last state
		// list
		// [351, 325, 305]
		System.out.println(randomListNumber);

		// Let's call iterator method over the list
		iterator = randomListNumber.iterator();

		// changing list structure while iterating over the list
		// and we will get ConcurrentModificationException
		// cause we can do the operation of get and remove while using the iterator over
		// the list
		while (iterator.hasNext()) {
			int randomnumber = (int) iterator.next();
			if ((randomnumber % 3) == 0) {
				try {
					randomListNumber.add(3);
				} catch (ConcurrentModificationException e) {
					// we will get ConcurrentModificationException
					System.out.println(e);
				}
			}
		}

	}

}
