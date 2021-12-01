import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    private JPanel loginPanel;
    private JPanel mainPanel;
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JTextField textField1;
    private JFormattedTextField emailFormattedTextField;
    private JFormattedTextField passwordFormattedTextField;
    private JTextField textField2;
    private JButton forgotPasswordButton;
    private JButton signUpButton;

    public Login(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();
    }

    public static void main(String[] args) {

        JFrame loginScreen = new Login("Login");

    }
}
