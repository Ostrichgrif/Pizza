import javax.swing.*;
import java.awt.*;

public class Sides extends JFrame{
    private JPanel mainPanel;
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton sidesButton;
    private JButton pizzaButton;
    private JButton beveragesButton;
    private JPanel pizzaPanel;
    private JButton Breadsticks;
    private JButton BreakstickBites;
    private JButton BCCC;
    private JLabel breadstickImage;
    private JLabel Cookie;
    private JButton P1;
    private JButton P2;
    private JButton P3;
    private JLabel BreadbitesImage;
    private JPanel quantityTab;
    private JLabel quantityText;
    private JTextArea quantity2;
    private JButton plusquantity2;
    private JButton minusquantity2;
    private JTextArea Quantity1;
    private JButton plusquantity1;
    private JButton minusquantity1;
    private JRadioButton marinara1;
    private JRadioButton marinara2;
    private JButton Checkout;
    private JTextArea quantity3;
    private JButton plusquantity3;
    private JButton minusquantity3;

    public Sides(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();
    }
}
