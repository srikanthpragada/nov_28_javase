package swing;



import java.awt.Container;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
	

public class SimpleFrame extends JFrame {
    
    public SimpleFrame() {
      super("Date & Time");
      Container c = getContentPane();
      JLabel lbl = new JLabel();
      lbl.setHorizontalAlignment( JLabel.CENTER);
      lbl.setText ( new Date().toString());
      c.add (lbl);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
    
    public static void main(String args[]) {
        SimpleFrame f = new SimpleFrame();
        f.setSize(300,200);
        f.setVisible(true);
    }
    
    
}
