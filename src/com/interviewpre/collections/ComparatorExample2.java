package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 implements Comparable<Movie1> {
    private int releaseYear;
    private String name;
    private String genre;

    public Movie1(int releaseYear, String name, String genre) {
        this.releaseYear = releaseYear;
        this.name = name;
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie1 [releaseYear=" + releaseYear + ", name=" + name + ", genre=" + genre + "]";
    }

    @Override
    public int compareTo(Movie1 o) {
        // Sort by name
        return this.name.compareTo(o.name);
    }
}

public class ComparatorExample2 {
    public static void main(String[] args) {
        ArrayList<Movie1> list = new ArrayList<>();
        list.add(new Movie1(2024, "goat", "scifi"));
        list.add(new Movie1(2011, "sivaji", "political"));
        list.add(new Movie1(2020, "mandadu", "timeloop"));
 Collections.sort(list, new Comparator<Movie1>() {

	@Override
	public int compare(Movie1 o1, Movie1 o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getReleaseYear(), o2.getReleaseYear());
	}
	 
});
        for (Movie1 movie : list) {
            System.out.println(movie);
        }
    }
}
