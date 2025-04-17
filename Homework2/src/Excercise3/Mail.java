package Excercise3;

import java.time.LocalDateTime;

public class Mail {
	private String senderAdress;
	private String message;
	private String subject;
	private boolean read;
	private LocalDateTime time;
	
	//CONSTRUCTOR
	/**
	 * Constructor for Mail. The boolean read is set to default false and the time is set to the current system time.
	 * @param sender the E-mail Address of the sender
	 * @param message the message to send
	 * @param subject the subject of the email
	 * @author aabert
	 */
	public Mail(String sender, String message, String subject) {
		this.senderAdress=sender;
		this.message=message;
		this.subject=subject;
		this.read=false;
		this.time= LocalDateTime.now();
	}
	
	/**
	 * Constructor for Mail. Read is set to false as default.
	 * You can set the datetime yourself.
	 * @param sender the E-mail Address of the sender
	 * @param message the message to send
	 * @param subject the subject of the email
	 * @param year Year of sending
	 * @param month Month of sending
	 * @param dayOfMonth Day of Month of sending
	 * @param hour Hour of sending(24 hour system)
	 * @param min minute of sending
	 * @param sec second of sending
	 */
	public Mail(String sender, String message, String subject, int year, int month, int dayOfMonth, int hour, int min, int sec) {
		this.senderAdress=sender;
		this.message=message;
		this.subject=subject;
		this.read=false;
		this.time= LocalDateTime.of(year, month, dayOfMonth, hour, min, sec);
	}
	
	//METHODS
	
	/**
	 * Simulates reading the message. Sets read to true.
	 * @author aabert
	 */
	public void readMessage() {
		this.read=true;
	}
	
	/**
	 * prints the Mail into the console
	 * For return String see toString()
	 * @author aabert
	 */
	public void print() {
		System.out.println(subject + " from " + senderAdress  + " on " + time.toString().substring(0, 19)  + ":\n" + message);
	}
	
	/**
	 * returns the Mail in a formatted String.
	 * For system output see print()
	 * @author aabert
	 */
	
	//GETTERS AND SETTERS
	public String toString() {
		return subject + " from " + senderAdress  + " on " + time.toString().substring(0, 19)  + ":\n" + message;
	}

	public String getSenderAdress() {
		return senderAdress;
	}

	public void setSenderAdress(String senderAdress) {
		this.senderAdress = senderAdress;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
