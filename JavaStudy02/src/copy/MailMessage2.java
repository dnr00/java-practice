package copy;

public class MailMessage2 implements Cloneable {

	protected String sender;
	protected String recipient;
	protected StringBuffer messageText;
	
	public MailMessage2(String from, String to, String message) {
		sender = from;
		recipient = to;
		messageText = new StringBuffer(message);
	}

	public StringBuffer getMessageText() {
		return messageText;
	}

	protected Object clone() CloneNotSupportedException {
		MailMessage mm = (MailMessage)(super.clone());
		mm.messageText = new StringBuffer(messageText.toString());
		return mm;
	}
}
