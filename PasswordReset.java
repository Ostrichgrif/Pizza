import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordReset extends JFrame{


    private JPanel mainPanel;
    private JLabel logoImage;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton resetButton;
    private JTextField textField1;
    private JTextArea pleaseEnterEmailToTextArea;

    public PasswordReset(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

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
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame profile = new Profile("Profile");
                dispose();
            }
        });
    }
}

