package model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	String name;
	long year;
	List<String> genres = new ArrayList<>();
	
	public Movie(String name, long year, List<String> genres) {
		this.name = name;
		this.year = year;
		this.genres = genres;
	}	
	
	public String getName(Movie movie) {
		return movie.name;
	}
}
