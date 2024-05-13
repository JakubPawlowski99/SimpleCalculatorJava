package Classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NumericButtons extends JPanel {
    
    public NumericButtons() {
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
            switch (buttonText) {
                case "0":
                    // Handle button 0
                    // Implement your logic here
                    break;
                case "1":
                    // Handle button 1
                    // Implement your logic here
                    break;
                case "2":
                    // Handle button 2
                    // Implement your logic here
                    break;
                case "3":
                    // Handle button 3
                    // Implement your logic here
                    break;
                case "4":
                    // Handle button 4
                    // Implement your logic here
                    break;
                case "5":
                    // Handle button 5
                    // Implement your logic here
                    break;
                case "6":
                    // Handle button 6
                    // Implement your logic here
                    break;
                case "7":
                    // Handle button 7
                    // Implement your logic here
                    break;
                case "8":
                    // Handle button 8
                    // Implement your logic here
                    break;
                case "9":
                    // Handle button 9
                    // Implement your logic here
                    break;
                default:
                    // Do nothing for other buttons
                    break;
            }
        }
    }
}
