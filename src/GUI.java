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
        JLabel titleLable = new JLabel("Password Generatro");
        titleLable.setFont(new Font("Dialog", Font.BOLD, 32));
    }
}