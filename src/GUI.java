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
        passwordOutput.setFont(new Font("Dialog", Font.BOLD, 32));

        JScrollPane passworrdOutputPane = new JScrollPane(passwordOutput);
        passworrdOutputPane.setBounds(25, 97, 479, 70);
        passworrdOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passworrdOutputPane);

        JLabel passwordLengthLebel = new JLabel("Password Length");
        passwordLengthLebel.setFont(new Font("Dialog", Font.PLAIN, 32));
        passwordLengthLebel.setBounds(25, 215, 272, 39);
        add(passwordLengthLebel);

        JToggleButton uppercaseToggle = new JToggleButton("Uppercase");
        uppercaseToggle.setBounds(25, 302, 225, 56);
        add(uppercaseToggle);

        JToggleButton lowercaseToggle = new JToggleButton("Lowercase");
        lowercaseToggle.setBounds(282, 302, 225, 56);
        add(lowercaseToggle);

        JToggleButton numbersToggle = new JToggleButton("Numbers");
        numbersToggle.setBounds(25, 373, 225, 56);
        add(numbersToggle);

        JToggleButton symbolToggle = new JToggleButton("Symbols");
        symbolToggle.setBounds(282, 373, 225, 56);
        add(symbolToggle);

    }
}