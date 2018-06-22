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
		Review review1 = new Review(1L, "Java", "Java Description", "test_duck_pic.jpg");

		reviewList.put(review1.getId(), review1);
		

	}

	public ReviewRepository(Review... reviews) {
		for(Review reviewEntry : reviews) {
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
