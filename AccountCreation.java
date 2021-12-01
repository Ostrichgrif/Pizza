import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountCreation extends JFrame{
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JPasswordField passField2;
    private JPasswordField passField;
    private JTextField cardField;
    private JTextField expField;
    private JTextField cvvfield;
    private JTextField addressField;
    private JLabel errorField;
    private JButton saveButton;
    private JButton contactUsButton;

    public AccountCreation(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkInformation();

            }
        });

        //Navigation
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame mainMenu = new Menu("Main Menu");
                dispose();
            }
        });
        contactUsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame contactUs = new Contact("Contact Us");
                dispose();
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fullMenu = new FullMenu("Menu");
                dispose();
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame profilePage = new Profile("Profile");
                dispose();
            }
        });

    }
    public void checkInformation() {
        String tempString;
        char[] tempPass;

        errorField.setText("");

        tempString = emailField.getText();
        if (tempString.indexOf('@') == -1) {
            errorField.setText("Invalid email address");
        }

        tempString = phoneField.getText();
        if (tempString.length()>10 || tempString.length()<10) {
            errorField.setText("Invalid phone number");
        }


    }
    public void saveInformation() {

    }

    public static void main(String[] args) {
        JFrame frame = new AccountCreation("Account Creation");
    }
}
