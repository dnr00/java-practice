package using.exception;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DataFrame extends JFrame {
	
	protected DataPanel panel;

	public static void main(String[] args) {
		DataFrame df = new DataFrame();
		df.setVisible(true);
	}

	public DataFrame() {
		super("Enter Data");
		buildLayout();
		pack();
	}

	protected void buildLayout() {
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		panel = new DataPanel();
		pane.add(panel, BorderLayout.CENTER);
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent event) {
				onOk();
			}
		}
		);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		panel.add(button);
		pane.add(panel, BorderLayout.SOUTH);
		}
	
		protected void onOk() {
			try {
			panel.validateInput();
			System.exit(0);
			}
			catch (InputValidationException ive) {
				ive.getErrorSource().requestFocus();
				JOptionPane.showMessageDialog(this, ive.getMessage(),
												"Validation Error", 
												JOptionPane.ERROR_MESSAGE);
			}
		}

}
