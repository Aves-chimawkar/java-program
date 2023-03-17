import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FindAndReplace extends JFrame {
    private JTextField textField, findField, replaceField, resultField;
    private JLabel countLabel;
    public FindAndReplace() {
        // Create the four TextFields
        textField = new JTextField(20);
        findField = new JTextField(10);
        replaceField = new JTextField(10);
        resultField = new JTextField(20);
        // Create the button and add an action listener to handle clicks
        JButton replaceButton = new JButton("Replace");
        replaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the text from the TextFields
                String text = textField.getText();
                String find = findField.getText();
                String replace = replaceField.getText();
                // Replace all instances of the "find" string with the "replace" string
                String result = text.replaceAll(find, replace);
                // Display the result in the result TextField
                resultField.setText(result);
                // Display the count of total number of replacements made
                int count = text.split(find, -1).length - 1;
                countLabel.setText("Replacements made: " + count);}
        });
        // Create the "Clear" button and add an action listener to handle clicks
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear all TextFields and reset the count label
                textField.setText("");
                findField.setText("");
                replaceField.setText("");
                resultField.setText("");
                countLabel.setText(""); }
        });
        // Create the label for the count of total number of replacements made
        countLabel = new JLabel("");
        // Create the panel to hold the TextFields and buttons
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Text:"));
        panel.add(textField);
        panel.add(new JLabel("Find:"));
        panel.add(findField);
        panel.add(new JLabel("Replace:"));
        panel.add(replaceField);
        panel.add(new JLabel(""));
        panel.add(replaceButton);
        panel.add(new JLabel(""));
        panel.add(clearButton);
        // Create the panel to hold the result TextField and count label
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.add(new JLabel("Result:"), BorderLayout.NORTH);
        resultPanel.add(resultField, BorderLayout.CENTER);
        resultPanel.add(countLabel, BorderLayout.SOUTH);
        // Add the panels to the frame
        add(panel, BorderLayout.NORTH);
        add(resultPanel, BorderLayout.CENTER);
        // Set the size and make the frame visible
        setSize(400, 250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FindAndReplace(); }
}
