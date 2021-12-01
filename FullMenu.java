import javax.swing.*;
import java.awt.*;

public class FullMenu extends JFrame{

    private JPanel mainPanel;
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton sidesButton;
    private JButton pizzaButton;
    private JButton beveragesButton;
    private JTextArea sizeSMLTextArea;
    private JTextPane breadSticks$4BreadStickBitesTextPane;
    private JTextArea sizeSMLTextArea1;

    public FullMenu(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();
    }

}
