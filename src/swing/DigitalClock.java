package swing;

import java.awt.Container;
import java.awt.Font;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;
import javax.swing.Timer;

public class DigitalClock extends javax.swing.JFrame {
    Timer t;
    JLabel lblTime;
    
    public DigitalClock() {
        super("Digital Clock");
        lblTime = new JLabel();
        lblTime.setHorizontalAlignment(JLabel.CENTER);
        lblTime.setFont( new Font("Arial", Font.BOLD, 30));
        Container c = getContentPane();
        c.add(lblTime);
        
        t = new Timer(1000, 
                e -> lblTime.setText(LocalTime.now().format
                     (DateTimeFormatter.ofPattern("HH:mm:ss"))));
        t.start();
        setSize(200, 150);
    }

   
    public static void main(String args[]) {
        DigitalClock f = new DigitalClock();
        f.setVisible(true);
    }



}
