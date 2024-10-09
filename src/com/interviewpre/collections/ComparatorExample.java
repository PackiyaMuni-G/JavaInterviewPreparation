package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Movie {
	@Override
	public String toString() {
		return "Movie [name=" + name + ", releasedYear=" + releasedYear + ", actor=" + actor + "]";
	}

	String name;
	int releasedYear;
	String actor;
	public Movie(String name, int releasedYear, String actor) {
		super();
		this.name = name;
		this.releasedYear = releasedYear;
		this.actor = actor;
	}


	
}
class ActorComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.actor.compareTo(o2.actor);
	}
	
}
public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<>();
		list.add(new Movie("Thangalaan",2024,"vikram"));
		list.add(new Movie("Villan",2010,"Ajith"));
		list.add(new Movie("jailer",2023,"Rajni"));
		list.add(new Movie("mersal",2020,"vijay"));
		
		Collections.sort(list, new ActorComparator());
		for(Movie movie:list) {
			System.out.println(movie);
		}
		
	}
	

}
