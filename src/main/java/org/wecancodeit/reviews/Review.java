package org.wecancodeit.reviews;

public class Review {

	public Review(long id, String title, String description, String category, String content, String date,
			String imageUrl) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.category = category;

		this.description = description;
		this.content = content;
		this.imageUrl = imageUrl;
	}
	
	public Review(long id, String title, String description, String date) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.date = date;


	}

	private long id;
	private String title;
	private String description;
	private String category;

	private String content;
	private String date;
	private String imageUrl;

	public long getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public String getCategory() {
		return this.category;
	}

	public String getContent() {
		return this.content;
	}

	public String getDate() {
		return this.date;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public String getDescription() {
		return this.description;
	}

}
