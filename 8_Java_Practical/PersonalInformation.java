import java.awt.*;
import java.awt.event.*;

public class PersonalInformation extends Frame implements ActionListener {
    TextField firstNameField, lastNameField, addressField, mobileNumberField;
    Checkbox computerCheckbox, sportsCheckbox, musicCheckbox;
    Button submitButton;
    TextArea resultTextArea;

    public PersonalInformation() {
        setTitle("Personal Information");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2, 10, 10));

        Label firstNameLabel = new Label("First Name:");
        firstNameField = new TextField();
        add(firstNameLabel);
        add(firstNameField);

        Label lastNameLabel = new Label("Last Name:");
        lastNameField = new TextField();
        add(lastNameLabel);
        add(lastNameField);

        Label addressLabel = new Label("Address:");
        addressField = new TextField();
        add(addressLabel);
        add(addressField);

        Label mobileNumberLabel = new Label("Mobile Number:");
        mobileNumberField = new TextField();
        add(mobileNumberLabel);
        add(mobileNumberField);
        Label genderLabel = new Label("Gender:");

        add(genderLabel);
        CheckboxGroup genderCheckboxGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderCheckboxGroup, true);
        Checkbox femaleCheckbox = new Checkbox("Female", genderCheckboxGroup, false);
        Checkbox otherCheckbox = new Checkbox("Other", genderCheckboxGroup, false);

        add(maleCheckbox);
        add(femaleCheckbox);
        add(otherCheckbox);
        Label interestsLabel = new Label("Interests:");
        
        add(interestsLabel);
        computerCheckbox = new Checkbox("Computer");
        sportsCheckbox = new Checkbox("Sports");
        musicCheckbox = new Checkbox("Music");
        add(computerCheckbox);
        add(sportsCheckbox);
        add(musicCheckbox);

        submitButton = new Button("Submit");
        add(submitButton);
        submitButton.addActionListener(this);

        resultTextArea = new TextArea();
        add(resultTextArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String address = addressField.getText();
        String mobileNumber = mobileNumberField.getText();
        String gender = "";
        if (computerCheckbox.getState()) {
            gender = "Computer";
        }
        if (sportsCheckbox.getState()) {
            if (gender.length() > 0) {
                gender += ", ";
            }
            gender += "Sports";
        }
        if (musicCheckbox.getState()) {
            if (gender.length() > 0) {
                gender += ", ";
            }
            gender += "Music";
        }
        String result = "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Address: " + address + "\n" +
                "Mobile Number: " + mobileNumber + "\n" +
                "Gender: " + gender;
        resultTextArea.setText(result);
    }
    public static void main(String[] args) {
        new PersonalInformation();
    }
}