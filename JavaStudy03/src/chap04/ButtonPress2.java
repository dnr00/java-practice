package chap04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonPress2 extends JFrame {

	public static void main(String[] args) {
		ButtonPress2 bp = new ButtonPress2();
		bp.setSize(400, 300);
		bp.setVisible(true);
	}

	public ButtonPress2() {
		JMenuBar jmb = new JMenuBar();
		JMenu menu = new JMenu("Execute");
		jmb.add(menu);
		JMenuItem jmi = new JMenuItem("Database Query");
		menu.add(jmi);
		jmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				SwingWorker<Object,Object> worker =
						new SwingWorker<Object,Object>() {
					public Object doInBackground() {
						return performDatabaseQuery();
					}
				};
				Thread t = new Thread(worker);
				t.start();
			}
		});
		setJMenuBar(jmb);
	}

	private Object performDatabaseQuery() {
	
		// Simulate long-running database query
		try {
			Thread.sleep(5000);
		} catch (Exception e) {}
		;
		return null;
	}
}
 // 얘는 클릭하면 딜레이가 없는데... 왜지
