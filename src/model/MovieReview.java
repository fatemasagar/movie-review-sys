package model;

public class MovieReview {
	User user;
	Movie movie;
	int rating;
	
	public MovieReview(User user, Movie movie, int rating) {
		this.user = user;
		this.movie = movie;
		this.rating = rating;
	}
}
