package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class BorderLayoutDemo extends javax.swing.JFrame {
    
    public BorderLayoutDemo() {
     super("BorderLayout Demo");
     // default layout manager is BorderLayout
     Container c = getContentPane();  
     c.add( new JButton("Top Button"), BorderLayout.PAGE_START);
     c.add( new JButton("Bottom Button"), BorderLayout.PAGE_END);
     c.add( new JButton("Left Button"), BorderLayout.LINE_START);
     c.add( new JButton("Right Button"), BorderLayout.LINE_END);
     // place multiple components at the center using JPanel
     JPanel p = new JPanel();  // default FlowLayout
     p.add( new  JLabel("Label"));
     p.add( new JTextField(20));
     c.add(p);  //  CENTER
     
     setSize(500,200);
     setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        new BorderLayoutDemo();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
