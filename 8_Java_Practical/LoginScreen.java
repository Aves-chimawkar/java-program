import java.awt.*;
import java.awt.event.*;
public class LoginScreen extends Frame implements ActionListener {
    private Label userLabel;
    private Label passLabel;
    private TextField userField;
    private TextField passField;
    private Button submitButton;
    private Button clearButton;
    private int attempts = 3;
    public LoginScreen() {
        setTitle("Login Screen");
        setLayout(new GridLayout(3, 2));
        userLabel = new Label("Username: ");
        add(userLabel);
        userField = new TextField(20);
        add(userField);
        passLabel = new Label("Password: ");
        add(passLabel);
        passField = new TextField(20);
        passField.setEchoChar('*');
        add(passField);
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);
        clearButton = new Button("Clear");
        clearButton.addActionListener(this);
        add(clearButton);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String username = userField.getText();
            String password = passField.getText();
            if (username.equals(password)) {
                // successful login
                System.out.println("Login Successful!");
                dispose(); // close the login screen
            } else {
                // incorrect login details
                attempts--;
                if (attempts == 0) {
                    // no more attempts left
                    System.out.println("Login Failed! No more attempts left.");
                    dispose(); // close the login screen
                } else {
                    // show remaining attempts
                    System.out.println("Login Failed! " + attempts + " attempts remaining.");
                    userField.setText("");
                    passField.setText("");
                }
            }
        } else if (e.getSource() == clearButton) {
            userField.setText("");
            passField.setText("");
            attempts = 3; // reset attempts
        }
    }
    public static void main(String[] args) {
        new LoginScreen();
    }
}
