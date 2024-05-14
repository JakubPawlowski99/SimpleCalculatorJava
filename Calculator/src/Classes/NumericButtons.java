package Classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NumericButtons extends JPanel {
    
    private InputBox inputBox;

    public NumericButtons(InputBox inputBox) {
        this.inputBox = inputBox;

        // Set GridLayout with 4 rows and 3 columns
        this.setLayout(new GridLayout(4, 3));

        // Add numeric buttons 1-9
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i)); // Create button with number label
            this.add(button); // Add button to panel

            // Add action listener to each numeric button
            button.addActionListener(new NumericButtonListener());
        }

        // Add zero button
        JButton zeroButton = new JButton("0");
        this.add(zeroButton);

        // Add action listener to zero button
        zeroButton.addActionListener(new NumericButtonListener());
    }

    // Action listener for numeric buttons
    private class NumericButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = ((JButton) e.getSource()).getText();
            inputBox.updateEquation(buttonText);
        }
    }
}
