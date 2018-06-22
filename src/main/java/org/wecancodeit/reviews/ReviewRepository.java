package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.reviews.Review;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	/* Sample Reviews */

	public ReviewRepository() {
		
		Review review1 = new Review(54325L, "Life Changing", "THE childhood defining book", "Children's Books",
				"LOVED this book as a child. Every time I read this book, it brings me back to the racous days of my youth, full of wonder and experimentation."
				+  " A great read for kids of all ages. 5 Stars!", "5/28/2017", "review_thumbs_up");
		
		Review review2 = new Review(25389L, "Disgustingly Unrealistic", "What are they filling our kids' heads with these days?", "Children's Books", 
				"How do we expect our children to keep useful information in their minds while filling it with the type of abnormal behaviors and ludicrous characters "
				+ "contained in a book such as this? Keep away from your children at all costs. Terrible customer service.", "6/05/2018", "review_thumbs_down");
		
		reviewList.put(review1.getId(), review1);
		reviewList.put(review2.getId(), review2);

	}

	public ReviewRepository(Review... reviews) {
		for (Review reviewEntry : reviews) {
			reviewList.put(reviewEntry.getId(), reviewEntry);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
