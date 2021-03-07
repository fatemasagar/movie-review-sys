package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Movie;

public class MovieSystem {
	
	List<Movie> movies = new ArrayList<>();
	
	public List<Movie> addMovie(Movie movie, List<Movie> movies) {
		this.movies = movies;
		
		Iterator<Movie> iterator = movies.iterator();
		
		while (iterator.hasNext()) {
			Movie mv = iterator.next();
			if ( mv.getName(movie) == movie.getName(movie)) {
				return this.movies;
			}
		}
		
		movies.add(movie);
		return this.movies;
	}

}
