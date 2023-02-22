package using.exception;

import java.awt.GridLayout;
import javax.swing.*;

public class DataPanel extends JPanel {

	protected JTextField nameField;
	protected JTextField ageField;
	
	public DataPanel() {
		buildDisplay();
	}
	
	public void validateInput() throws InputValidationException {
		///nameField.setText("test");
		System.out.println("name: " + nameField.getName());
		System.out.println("getText: " + nameField.getText());
		String name = nameField.getText();
		if (name.length() == 0) { //이거 0 아닐때도 왜 오류창이 뜰까?
			throw new InputValidationException("No name was specified",
												nameField);
		}
		String age = ageField.getText();
		try {
			int value = Integer.parseInt(age);
			if (value <= 0) {
				throw new InputValidationException("Age value must be" +
													"a positive integer",
													ageField);
			}
		}
		catch (NumberFormatException e) {
			throw new InputValidationException("Age value is missing " +
												"or invalid", ageField);
		}
	}
	
	protected void buildDisplay() {
		setLayout(new GridLayout(2, 2, 10, 5));
		JLabel label = new JLabel("Name:");
		add(label);
		nameField = new JTextField(10);
		add(nameField);
		label = new JLabel("Age:");
		add(label);
		ageField = new JTextField(10);
		add(ageField);
	}
}
