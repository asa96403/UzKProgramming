package Excercise1;

/**
 * Main class for testing purposes
 */
public class Main {

	public static void main(String[] args) {
		Publication pub = new Publication("test", 2010);
		System.out.println(pub.getInfo());
		Book book1 = new Book("Programming", 2025, "human");
		System.out.println(book1.getInfo());
		Textbook book2 = new Textbook("Database Systems", 2024, "Rosenkranz", "Database");
		System.out.println(book2.getInfo());
	}

}
