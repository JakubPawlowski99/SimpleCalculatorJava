package Classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FunctionButtons extends JPanel {
    
    private InputBox inputBox;

    public FunctionButtons(InputBox inputBox) {
        this.inputBox = inputBox;

        // Set GridLayout with 4 rows and 4 columns
        this.setLayout(new GridLayout(4, 4));

        // Add function buttons
        String[] buttonLabels = {
            "C", "±", "%", "/", 
            "x", "-", "+", "=", 
            ".", "sqrt", "x²", "1/x"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label); // Create button with label
            this.add(button); // Add button to panel

            // Add action listener to each function button
            button.addActionListener(new FunctionButtonListener());
        }
    }

    // Action listener for function buttons
    private class FunctionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = ((JButton) e.getSource()).getText();
            // Implement functionality for each button
            switch (buttonText) {
                case "C":
                    inputBox.clearEquation();
                    break;
                case "±":
                    // Handle ± button
                    // Implement your logic here
                    break;
                case "%":
                    // Handle % button
                    // Implement your logic here
                    break;
                case "/":
                    inputBox.updateEquation(" / ");
                    break;
                case "x":
                    inputBox.updateEquation(" * ");
                    break;
                case "-":
                    inputBox.updateEquation(" - ");
                    break;
                case "+":
                    inputBox.updateEquation(" + ");
                    break;
                case "=":
                    evaluateEquation();
                    break;
                case ".":
                    inputBox.updateEquation(".");
                    break;
                case "sqrt":
                    // Handle sqrt button
                    // Implement your logic here
                    break;
                case "x²":
                    // Handle x² button
                    // Implement your logic here
                    break;
                case "1/x":
                    // Handle 1/x button
                    // Implement your logic here
                    break;
                default:
                    break;
            }
        }

        private void evaluateEquation() {
            String equation = inputBox.getEquation();
            double result = 0;
            try {
                result = evaluateSimpleEquation(equation);
                inputBox.setEquation(Double.toString(result));
            } catch (Exception ex) {
                inputBox.setEquation("Error");
            }
        }

        private double evaluateSimpleEquation(String equation) throws Exception {
            String[] tokens = equation.split(" ");
            if (tokens.length != 3) {
                throw new Exception("Invalid equation format");
            }

            double num1 = Double.parseDouble(tokens[0]);
            double num2 = Double.parseDouble(tokens[2]);
            String operator = tokens[1];

            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    return num1 / num2;
                default:
                    throw new Exception("Unknown operator");
            }
        }
    }
}
