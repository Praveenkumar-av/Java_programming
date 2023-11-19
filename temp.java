import javax.swing.*;
import java.awt.*;
public class temp extends JFrame {
    // constructor
    public temp() {
        // set the title of the JFrame
        setTitle("Product Registration Form");

        // set the layout of the JFrame
        setLayout(new GridLayout(0, 2));

        // create the labels and text fields
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailTextField = new JTextField();
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneTextField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressTextField = new JTextField();
        JLabel cityZipLabel = new JLabel("City/Zip Code:");
        JTextField cityZipTextField = new JTextField();
        JLabel stateLabel = new JLabel("State:");
        JTextField stateTextField = new JTextField();
        JLabel productInfoLabel = new JLabel("Product Information:");
        JTextField productInfoTextField = new JTextField();
        JLabel productModelLabel = new JLabel("Product Model:");
        JTextField productModelTextField = new JTextField();
        JLabel productFabricationYearLabel = new JLabel("Product Fabrication Year:");
        JTextField productFabricationYearTextField = new JTextField();
        JLabel purchaseDateLabel = new JLabel("Purchase Date:");
        JTextField purchaseDateTextField = new JTextField();

        // add the labels and text fields to the JFrame
        add(emailLabel);
        add(emailTextField);
        add(phoneLabel);
        add(phoneTextField);
        add(addressLabel);
        add(addressTextField);
        add(cityZipLabel);
        add(cityZipTextField);
        add(stateLabel);
        add(stateTextField);
        add(productInfoLabel);
        add(productInfoTextField);
        add(productModelLabel);
        add(productModelTextField);
        add(productFabricationYearLabel);
        add(productFabricationYearTextField);
        add(purchaseDateLabel);
        add(purchaseDateTextField);

        // create the register button
        JButton registerButton = new JButton("Register Product");

        // add the register button to the JFrame
        add(registerButton);

        // set the size of the JFrame
        setSize(500, 300);

        // set the JFrame to be visible
        setVisible(true);
    }

    // main method
    public static void main(String[] args) {
        // create an instance of the ProductRegistrationForm class
        temp form = new temp();
    }
}
