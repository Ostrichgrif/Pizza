import javax.swing.*;
import java.awt.*;

public class Contact extends JFrame{
    private JPanel mainPanel;
    private JPanel Header;
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JTextPane Message;

    public Contact(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();
    }

}
