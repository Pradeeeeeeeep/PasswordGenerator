import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame {
    public GUI() {
        super("Password Generator");
        setSize(540, 570);
        setResizable(false);
        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addGUIComponents();
    }

    private void addGUIComponents(){
        JLabel titleLable = new JLabel("Password Generator");
        titleLable.setFont(new Font("Dialog", Font.BOLD, 32));
        titleLable.setHorizontalAlignment(SwingConstants.CENTER);
        titleLable.setBounds(0, 10, 540, 39);
        add(titleLable);

        JTextArea passwordOutput = new JTextArea();
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font(("Dialog", Font.BOLD, 32)));

        JScrollPane passworrdOutputPane = JScrollPane(passwordOutput);
        passworrdOutputPane.setBounds(25, 97, 479, 70);
        passworrdOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passworrdOutputPane);


    }
}