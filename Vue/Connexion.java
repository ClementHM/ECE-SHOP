package Vue;

import javax.swing.*;
import java.awt.*;

public class Connexion extends JDialog{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel Email;
    private JPanel page;
    private JButton connexionButton;

    public Connexion (JFrame parent){
        super(parent);
        setTitle("Connexion");
        setContentPane(page);
        setMinimumSize(new Dimension(600,600));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }


    public static void main(String[] args) {
        Connexion connexion =new Connexion(null);


    }
}

