package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class HighestFreq {

	public static void main(String[] args) {
		List<Integer> Intlist = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
		Map<Integer, Long> freqmap = Intlist.stream()
		.collect(Collectors.groupingBy(i->i,Collectors.counting()));
		Long maxfreq = freqmap.values().stream().mapToLong(Long::longValue).max().orElse(0);
		List<Integer> maxFreqValue = freqmap.entrySet().stream()
		.filter(entry->entry.getValue() == maxfreq)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		System.out.println(maxFreqValue);

	}

}
