package Excercise1;

public class Textbook extends Book{
	private String subject;

	public Textbook(String title, int year, String author, String subject) {
		super(title, year, author);
		this.subject= subject;
	}
	
	/**
	 * returns a formatted String with info about the Textbook
	 * @author aabert
	 */
	@Override
	public String getInfo() {
		return super.getInfo() + "The subject is: " + subject;
	}
	
	
}
