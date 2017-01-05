package swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FileViewerJava8 extends JFrame {

    private  JTextField  tfFilename;
    private  JTextArea taContents;
    private  JButton btnExit, btnBrowse;
    private  JButton btnOpen, btnSave;

    public FileViewerJava8 () {
        super("File Viewer 1.0");
        tfFilename = new JTextField(20);
        taContents = new JTextArea();
        // taContents.setEditable(false);

        JScrollPane sp = new JScrollPane(taContents,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        btnOpen = new JButton("Open");
        btnOpen.addActionListener(e -> openFile());
          

        btnBrowse = new JButton("...") ;
        btnBrowse.addActionListener(
              e -> {
                JFileChooser jfc = new JFileChooser(); 
                int status = jfc.showOpenDialog(this);
                if ( status == JFileChooser.APPROVE_OPTION)
                {
                    tfFilename.setText(
                        jfc.getSelectedFile().getAbsolutePath());
                    openFile();
                }
              }  // Lambda block
        );

        // arrange layout
        JPanel p1 = new JPanel();
        p1.add( new JLabel("Enter Filename :"));
        p1.add(tfFilename);
        p1.add(btnBrowse);
        p1.add(btnOpen);

        Container c = getContentPane();
        c.add( p1, BorderLayout.PAGE_START);
        c.add( sp );  // center
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
    }
    public static void main(String[] args) {
        FileViewerJava8 f = new FileViewerJava8();
        f.setSize(500,400);
        f.setVisible(true);
    }

    private  void openFile() {
        try {
           taContents.setText("");  // remove contents
           Path path = Paths.get(tfFilename.getText());
           Files.lines(path)
                   .forEach( line -> taContents.append(line + "\n"));
        }
        catch(Exception ex)  {
            taContents.setText("Error ->" + ex.getMessage());
        }
    }
}


