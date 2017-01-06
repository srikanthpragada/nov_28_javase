// Anonymous inner class for event handling 
package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventDemo3 extends JFrame {
	JButton btnShow, btnClear;
	JLabel lblNow;

	public ActionEventDemo3() {
		super("ActionEvent Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblNow = new JLabel();
		lblNow.setHorizontalAlignment(JLabel.CENTER);
		lblNow.setFont( new Font("Arial", Font.BOLD, 20));
		
		btnShow = new JButton("Show Date and Time");
		btnClear = new JButton("Clear");
		Container c = getContentPane();
		
		JPanel btnPanel = new JPanel();
		btnPanel.add(btnShow);
		btnPanel.add(btnClear);
		c.add(btnPanel, BorderLayout.PAGE_END);
		
		c.add(lblNow, BorderLayout.PAGE_START);
		
		btnShow.addActionListener
		    (e -> lblNow.setText( new Date().toString()));
		
		btnClear.addActionListener (e -> lblNow.setText(""));
			
	}

	public static void main(String[] args) {
		ActionEventDemo3 f = new ActionEventDemo3();
		f.setSize(400, 200);
		f.setVisible(true);
	}

}
