package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

 
public class ActionEventDemo1 extends JFrame 
             implements ActionListener {
	JButton btnExit;
	
	public ActionEventDemo1() {
		super("ActionEvent Demo");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		btnExit = new JButton("Exit");
		Container c = getContentPane();
		c.add(btnExit, BorderLayout.PAGE_END);
		btnExit.addActionListener(this);
	}

	public static void main(String[] args) {
	    ActionEventDemo1 f = new ActionEventDemo1();
	    f.setSize(400,200);
	    f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
