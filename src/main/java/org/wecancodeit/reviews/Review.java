package org.wecancodeit.reviews;

public class Review {
	
	public Review(long id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
		
	}

	private long id;
	private String title;
	private String category;
	/* ? */ private String description;

		
	private String content;
	/* ? */ private String date;
	/* ? */ private String imageUrl;

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
