package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository(Review...reviews) {
		for(Review reviewEntry : reviews) {
			reviewList.put(reviewEntry.getId(), reviewEntry);
		}
	}

	public ReviewRepository(Review review) {
		reviewList.put(review.getId(), review);
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
