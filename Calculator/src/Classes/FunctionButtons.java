package Classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FunctionButtons extends JPanel {
    
    public FunctionButtons() {
        // Set GridLayout with 5 rows and 4 columns
        this.setLayout(new GridLayout(5, 4));
        
        // Add function buttons
        String[] buttonLabels = {
            "C", "±", "%", "/", 
            "x", "-", "+", "=", 
            ".", "sqrt", "x²", "1/x"}; // Adjusted labels for clarity
            
        for (String label : buttonLabels) {
            JButton button = new JButton(label); // Create button with label
            this.add(button); // Add button to panel
            
            // Add action listener to each button
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String buttonText = ((JButton) e.getSource()).getText();
                    switch (buttonText) {
                        case "C":
                            // Clear current equation
                            // Implement your clear logic here
                            break;
                        case "±":
                            // Toggle sign of current number
                            // Implement your sign toggle logic here
                            break;
                        case "%":
                            // Handle percentage operation
                            // Implement your percentage logic here
                            break;
                        case "/":
                            // Handle division operation
                            // Implement your division logic here
                            break;
                        case "x":
                            // Clear current equation
                            // Implement your clear logic here
                            break;
                        case "-":
                            // Toggle sign of current number
                            // Implement your sign toggle logic here
                            break;
                        case "+":
                            // Handle percentage operation
                            // Implement your percentage logic here
                            break;
                        case "=":
                            // Handle division operation
                            // Implement your division logic here
                            break;
                        case ".":
                            // Clear current equation
                            // Implement your clear logic here
                            break;
                        case "sqrt":
                            // Toggle sign of current number
                            // Implement your sign toggle logic here
                            break;
                        case "x²":
                            // Handle percentage operation
                            // Implement your percentage logic here
                            break;
                        case "1/x":
                            // Handle division operation
                            // Implement your division logic here
                            break;
                        
                        default:
                            // Show message for unimplemented buttons
                            JOptionPane.showMessageDialog(null, "Button not implemented: " + buttonText);
                           
                    }
                }
            });
        }
    }
}
