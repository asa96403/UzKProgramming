package Excercise3;
import java.util.Scanner;

/**
 * Testing class
 */
public class Main {

	public static void main(String[] args) {
		Mail mail1 = new Mail("aabert@smail.uni-koeln.de", "This is a test message.", "Testing");
		Mail mail2 = new Mail("example@random.com", "This is a useful Email.", "Useful");
		Mail mail3 = new Mail("person@uni.de", "I want to inform you about this test.", "Test Info");
		Mail mail4 = new Mail("human@earth.global", "I am writing this message from earth.", "Earth");
		Mail mail5 = createCustomMail();
		mail1.print();
		Mail[] mails = new Mail[5];
		mails[0]= mail1;
		mails[1]=mail2;
		mails[2]=mail3;
		mails[3]=mail4;
		mails[4]=mail5;
		Inbox inbox1 = new Inbox(mails);
		inbox1.printAllMails();
		System.out.println("Nuber of unread messages: " + inbox1.countUnread());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the index of the mail to open: ");
		int input= scanner.nextInt();
		inbox1.open(input);
		System.out.println("Nuber of unread messages: " + inbox1.countUnread());
	}
	
	public static Mail createCustomMail() {
		System.out.println("--Create a custom mail--");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Email Adress: ");
		String sender = scanner.nextLine();
		System.out.println("Enter the message: ");
		String message = scanner.nextLine();
		System.out.println("Enter the subject: ");
		String subject = scanner.nextLine();
		System.out.println("Enter the year: ");
		int year = scanner.nextInt();
		System.out.println("Enter the Month: ");
		int month = scanner.nextInt();
		System.out.println("Enter the day of the month: ");
		int dOM = scanner.nextInt();
		System.out.println("Enter the Hour (24 hour-system): ");
		int hour = scanner.nextInt();
		System.out.println("Enter the Minute: ");
		int minute = scanner.nextInt();
		System.out.println("Enter the Second: ");
		int second = scanner.nextInt();
		return new Mail(sender, message,subject, year, month, dOM, hour, minute, second);
	}

}
