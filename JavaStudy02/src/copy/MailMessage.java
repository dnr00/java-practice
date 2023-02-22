package copy;

public class MailMessage implements Cloneable {

	protected String sender;
	protected String recipient;
	protected StringBuffer messageText;
	
	
	public MailMessage(String from, String to, String message) {
		sender = from;
		recipient = to;
		messageText = new StringBuffer(message);
	}

	public StringBuffer getMessageText() {
		return messageText;
	}

	//Create a new instance of MailMessage
	MailMessage original = new MailMessage("bspell", "jsmith",
										"This is the original text");
	//Get a shallow copy
	MailMessage shallowCopy = (MailMessage)(original.clone());
	
	//Modifiy the message text using the clone/shallow copy
	text.append(" with some additional text appended");
	
	//Now print out the message text using the origianl MailMessage
	System.out.println(original.getMessageText().toString());
	
	
}
