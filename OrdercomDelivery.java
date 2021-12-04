import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class OrdercomDelivery extends JFrame{
    private JPanel mainPanel;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JTextArea orderNumber;
    private JPanel Header;
    private JLabel logoImage;


    public OrdercomDelivery(String name) {
            super(name);

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setContentPane(mainPanel);
            this.setVisible(true);
            this.setMinimumSize(new Dimension(1080, 720));

            this.pack();


            double max = 999999999;
            double min = 100000000;
            double randomNum = Math.random()*(max-min+1)+min;
            String orderNum = "".valueOf(randomNum);
            orderNumber.setText(orderNum);


            homeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame menu = new Menu("Menu");
                    dispose();
                }
            });
            menuButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame fullMenu = new FullMenu("Full Menu");
                    dispose();
                }
            });
            contactUsButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame contact = new Contact("Contact Us");
                    dispose();
                }
            });
            profileButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame profile = new Profile("Profile");
                    dispose();
                }
            });
        }

}
