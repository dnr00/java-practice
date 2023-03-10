package edit.font01;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FontPropertiesPanel extends JPanel {

	protected JList<String> nameList;
	protected JComboBox<Integer> sizeBox;
	protected JCheckBox boldBox;
	protected JCheckBox italicBox;
	
//	protected SampleTextFrame frame;
	protected FontListener listener;
	
	public final static int[] fontSizes = {10, 12, 14, 18, 24, 32, 48, 64};
		
	public FontPropertiesPanel(SampleTextFrame stf) {
		super();
		frame = stf;
		createComponents();
		buildLayout();
	}
	
	protected void buildLayout() {
		JLabel label;
		GridBagConstraints constraints = new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(5, 10, 5, 10);
		constraints.gridx = 0;
		label = new JLabel("Name:", JLabel.LEFT);
		layout.setConstraints(label, constraints);
		add(label);
		label = new JLabel("Size", JLabel.LEFT);
		layout.setConstraints(label, constraints);
		add(label);
		layout.setConstraints(boldBox, constraints);
		add(boldBox);
		
		constraints.gridx++;
		nameList.setVisibleRowCount(3);
		JScrollPane jsp = new JScrollPane(nameList);
		layout.setConstraints(jsp, constraints);
		add(jsp);
		layout.setConstraints(sizeBox, constraints);
		add(sizeBox);
		layout.setConstraints(italicBox, constraints);
		add(italicBox);
	}

	protected void createComponents() {
		GraphicsEnvironment ge =
				GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] names = ge.getAvailableFontFamilyNames();
		nameList = new JList<String>(names);
		nameList.setSelectedIndex(0);
		nameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		nameList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				handleFontPropertyChange();
			}
		}
		);
		Integer sizes[] = new Integer[fontSizes.length];
		for (int i = 0; i < sizes.length; i++) {
			sizes[i] = new Integer(fontSizes[i]);	
		}
		sizeBox = new JComboBox<Integer>(sizes);
		sizeBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				handleFontPropertyChange();
			}	
		}
		);
		boldBox = new JCheckBox("Bold");
		boldBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				handleFontPropertyChange();
			}
		}
		);
		italicBox = new JCheckBox("Italic");
		italicBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				handleFontPropertyChange();
			}
		}
		);
	}
	
	public void setFontListener(FontListener fl) {
		listener = fl;
	}
	
	protected void handleFontPropertyChange() {
		listener.fontChanged(getSelectedFont());
	}
	
	public Font getSelectedFont() {
		String name = (String)(nameList.getSelectedValue());
		int style = 0;
		style += (boldBox.isSelected() ? Font.BOLD : 0);
		style += (italicBox.isSelected() ? Font.ITALIC : 0);
		int size = ((Integer)(sizeBox.getSelectedItem())).intValue();
		return new Font(name, style, size);
	}
//	public String getSelectedFontName() {
//		return (String)(nameList.getSelectedValue());
//	}

//	public int getSelectedFontSize() {
//		return ((Integer)(sizeBox.getSelectedItem())).intValue();
//	}

//	public boolean isBoldSelected() {
//		return boldBox.isSelected();
//	}
	
//	public boolean isItalicSelected() {
//		return italicBox.isSelected();
//	}

}
