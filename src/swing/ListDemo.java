package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListDemo extends JFrame implements ActionListener {
    DefaultListModel<String> data;
    JList<String> lst;
    JButton btnAdd, btnRemove, btnList, btnClear, btnSelectAll;

    public ListDemo() {
        super("List Demo");
        data = new DefaultListModel<>();  // mutable list data model
        data.addElement("Bill Gates");
        data.addElement("Larry Ellison");
        data.addElement("Micheal Dell");
        data.addElement("Larry Page");
        data.addElement("Sergey Brin");
        lst = new JList<>(data);

        btnAdd = new JButton("Add");
        btnRemove = new JButton("Remove");
        btnList = new JButton("List");
        btnClear = new JButton("Unselect");
        btnSelectAll = new JButton("Select All");

        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        btnList.addActionListener(this);
        btnClear.addActionListener(this);
        btnSelectAll.addActionListener(this);

        Container c = getContentPane();
        JScrollPane jsp = new JScrollPane(lst,
        		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        c.add(jsp, "Center");

        JPanel p = new JPanel();
        p.add(btnAdd);
        p.add(btnRemove);
        p.add(btnList);
        p.add(btnSelectAll);
        p.add(btnClear);

        c.add(p, BorderLayout.PAGE_END);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnClear) {
            lst.clearSelection();
        } else if (evt.getSource() == btnAdd) {
            String name = JOptionPane.showInputDialog(this, "Enter a name:", "Add", 
            		         JOptionPane.PLAIN_MESSAGE);
            if (name != null) {
                data.addElement(name);
            }
        } else if (evt.getSource() == btnList) {
            List<String> items = lst.getSelectedValuesList();
            String st = String.join("\n", items);
            JOptionPane.showMessageDialog(this, st, "Selected Items", 
            		    JOptionPane.INFORMATION_MESSAGE);
        } else if (evt.getSource() == btnRemove) {
            int res = JOptionPane.showConfirmDialog(this,
            		"Do you want to delete selected items?", 
            		"Confirm",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
            
            if (res == JOptionPane.YES_OPTION) {
                lst.getSelectedValuesList()
                   .forEach(name -> data.removeElement(name));
            }
        } // end of if
    } // end of actionPerformed

    public static void main(String args[]) {
        new ListDemo().setVisible(true);
    }
}