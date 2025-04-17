package Excercise3;

import java.util.ArrayList;

public class Inbox {
	private ArrayList<Mail> inbox;

	// CONSTRUCTORS
	/**
	 * parameterless Constructor for Inbox
	 * 
	 * @author aabert
	 */
	public Inbox() {
		inbox = new ArrayList<>();
	}

	/**
	 * Constructor of Inbox with initilization of Inbox with the Mails stored in the
	 * mails array
	 * 
	 * @param mails the emails to add to the Inbox
	 */
	public Inbox(Mail[] mails) {
		inbox = new ArrayList<>();
		for (int i = 0; i < mails.length; i++) {
			inbox.add(mails[i]);
		}
	}

	// METHODS
	/**
	 * Outprints the header of all emails that are currently in the inbox
	 * @author aabert
	 */
	public void printAllMails() {
		System.out.println("---Inbox---");
		int i = 1;
		for (Mail mail : inbox) {
			String ind;
			if (mail.isRead()) {
				ind = "read";
			} else {
				ind = "new";
			}
			System.out.println(i + "| " + ind + " | " + mail.getSubject() + " | " + mail.getSenderAdress() + " | "
					+ mail.getTime().toString().substring(0, 19));
			i++;
		}
	}
	
	/**
	 * Opens (prints) the email at the specified index (starting at one) from the inbox,
	 * sets read to true;
	 * @param index Index of the email to be printed
	 * @author aabert
	 */
	public void open(int index) {
		if(index> inbox.size() || index<=0) {
			System.err.println("There is no email with this index in your inbox!");
			return;
		}
		inbox.get(index-1).print();
		inbox.get(index-1).readMessage();
	}
	
	/**
	 * counts all unread messages in the inbox and returns the number of those
	 * @return number of unread messages
	 * @author aabert
	 */
	public int countUnread() {
		int numberUnread=0;
		for (Mail mail: inbox) {
			if(mail.isRead()==false) {
				numberUnread++;
			}
		}
		return numberUnread;
	}

}