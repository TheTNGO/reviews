package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	ReviewRepository testRepo;

	Review testReview1 = new Review(1L, "Test 1", "Test 1 Review");
	Review testReview2 = new Review(2L, "Test 2", "Test 2 Review");

	@Test
	public void shouldFindReviewOne() {
		testRepo = new ReviewRepository(testReview1);
		Review result = testRepo.findOne(testReview1.getId());

		assertThat(result, is(testReview1));
	}

	@Test
	public void shouldAddMultipleReviews() {
		testRepo = new ReviewRepository(testReview1, testReview2);

		Collection<Review> result = testRepo.findAll();

		assertThat(result, containsInAnyOrder(testReview1, testReview2));

	}

}
