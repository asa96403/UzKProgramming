package Excercise1;

public class Publication {
	private String title;
	private int year;
	
	/**
	 * Constructor for Publication, sets the base values
	 * @param title the title of the publication
	 * @param year the year of the publication
	 * @author aabert
	 */
	public Publication(String title, int year) {
		this.title=title;
		this.year=year;
	}
	
	/**
	 * outputs a formatted String with info about the publication
	 * @return the formatted String
	 * @author aabert
	 */
	public String getInfo() {
		return "The publication has the title "  + title + " and was published in " + year + ". ";
	}

}
