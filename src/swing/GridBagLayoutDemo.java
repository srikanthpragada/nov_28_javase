package swing;

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo extends JFrame {
  JTextField tfUname;
  JPasswordField tfPwd;
  JButton btnLogin;

  public GridBagLayoutDemo() {
    super("Login");
    GridBagConstraints gbc = new GridBagConstraints();

    tfUname = new JTextField(20);
    tfPwd = new JPasswordField(20);
    btnLogin = new JButton("Login");

    Container c = getContentPane();
    c.setLayout(new GridBagLayout());
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // first label
    c.add( new JLabel("UserName : "),gbc);

    // username
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new java.awt.Insets(2, 2, 2, 2);
    c.add(tfUname,gbc);

    // second label
    gbc.gridx = 0;
    gbc.gridy = 1;
    c.add(new JLabel("Password : "),gbc);

    // password
    gbc.gridx = 1;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new java.awt.Insets(2, 2, 2, 2);
    c.add(tfPwd,gbc);

    // button
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.gridwidth = 3;
    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.LINE_END;
    gbc.insets = new java.awt.Insets(2,2,2,2);
    c.add(btnLogin, gbc);
        
    }
    public static void main(String args[]) {
      GridBagLayoutDemo f =  new GridBagLayoutDemo();
      f.setSize(400,300);
      f.setVisible(true);
    }
}
