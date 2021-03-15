package com.example.count;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountHash {

	static void arrayElementCount(int inputArray[]) {
		// Creating a HashMap object with elements of inputArray as keys and their count
		// as values

		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		// checking every element of the inputArray

		for (int i : inputArray) {
			if (countMap.containsKey(i)) {
				// If element is present countMap, incrementing it's count by 1

				countMap.put(i, countMap.get(i) + 1);
			} else {
				// If element is not present in countMap,
				// adding this element to elementCountMap with 1 as it's value

				countMap.put(i, 1);
			}
		}

		System.out.println("Input Array : " + Arrays.toString(inputArray));

		System.out.println("Element Of Count : " + countMap);
	}

	public static void main(String[] args) {

		arrayElementCount(new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 9, 0, 0, 0, 1, 2, 5, });

	}
}
