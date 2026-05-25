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

    }
}