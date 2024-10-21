package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHigeshestSalary {

	public static void main(String[] args) {
		List<Integer> Salaries = Arrays.asList(3000, 6000, 4000, 8000, 7000, 6000);
		Optional<Integer> secondHighest = Salaries.stream()
		.sorted()
		.distinct()
		.skip(1)
		.findFirst();
	              System.out.println(secondHighest.isPresent()?secondHighest.get():"N/A");
		

	}

}
