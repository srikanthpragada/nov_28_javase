// Anonymous inner class for event handling 
package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionEventDemo2 extends JFrame {
	JButton btnExit;
	JLabel lblNow;

	public ActionEventDemo2() {
		super("ActionEvent Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblNow = new JLabel();
		lblNow.setHorizontalAlignment(JLabel.CENTER);
		lblNow.setFont( new Font("Arial", Font.BOLD, 20));
		
		btnExit = new JButton("Show Date and Time");
		Container c = getContentPane();
		c.add(btnExit, BorderLayout.PAGE_END);
		c.add(lblNow, BorderLayout.PAGE_START);
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 lblNow.setText( new Date().toString());
			}
		});
	}

	public static void main(String[] args) {
		ActionEventDemo2 f = new ActionEventDemo2();
		f.setSize(400, 200);
		f.setVisible(true);
	}

}
