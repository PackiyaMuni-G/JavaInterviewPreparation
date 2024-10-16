package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class ContainsString {

	public static void main(String[] args) {
List<String> StringList = Arrays.asList("apple","banana","kiwi","orange");
    String target="banana";
     boolean anyMatch = StringList.stream()
      .anyMatch(s->s.contains(target));
     System.out.println(anyMatch);
     

}
}