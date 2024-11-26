package com.java.book;

import java.util.Date;

public class BookVo {
	private int bookId;
	private String category;
	private String bookTitle;
	private int rating;
	private String authorName;
	private String publisher;
	private	Date date;
	private int genre1;
	private int genre2;
	private int genre3;
	private int isRental;
	private String imgUrl;
	private Date update;
	private String comment;
	
	BookVo() {
		
	}
	
	BookVo(String category, String bookTitle, String authorName, String publisher, int genre1, int genre2, int genre3, 
			int isRental, String imgUrl, Date update, String comment) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.publisher = publisher;
		this.genre1 = genre1;
		this.genre2 = genre2;
		this.genre2 = genre2;
		this.isRental = isRental;
		this.imgUrl = imgUrl;
		this.update = update;
		this.comment = comment;
	}
	
	// Getter, Setter
	public int getBook_id() {
		return bookId;
	}
	
	public void setBook_id(int book_id) {
		this.bookId = book_id;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getBook_title() {
		return bookTitle;
	}
	
	public void setBook_title(String book_title) {
		this.bookTitle = book_title;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthor_id(String authorName) {
		this.authorName = authorName;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getGenre1() {
		return genre1;
	}
	
	public void setGenre1(int genre1) {
		this.genre1 = genre1;
	}
	
	public int getGenre2() {
		return genre2;
	}
	
	public void setGenre2(int genre2) {
		this.genre2 = genre2;
	}
	
	public int getGenre3() {
		return genre3;
	}
	
	public void setGenre3(int genre3) {
		this.genre3 = genre3;
	}
	
	public int getIs_rental() {
		return isRental;
	}
	
	public void setIs_rental(int isRental) {
		this.isRental = isRental;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setImg_url(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public Date getUpd_date() {
		return update;
	}
	
	public void setUpd_date(Date update) {
		this.update = update;
	}
	
	public String getComment() {
		return comment;
		
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
}
