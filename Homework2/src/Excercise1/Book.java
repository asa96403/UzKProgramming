package Excercise1;

public class Book extends Publication{
	private String author;

	/**
	 * Constructor for Book
	 * @param title the title of the book
	 * @param year the year the book was published
	 * @param author the author of the book
	 * @author aabert
	 */
	public Book(String title, int year, String author) {
		super(title, year);
		this.author=author;
	}
	
	/**
	 * returns a formatted String with info about the book
	 * @author aabert
	 */
	@Override
	public String getInfo() {
		return super.getInfo() + "The book was written by "  + author + ". ";
	}

}
