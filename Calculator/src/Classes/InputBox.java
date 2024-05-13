package Classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputBox extends JPanel {
    
    public InputBox() {
        this.setPreferredSize(new Dimension(400, 120)); // Increased height to accommodate equation label
        this.setBackground(Color.white);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Vertical box layout
        
        // Title label
        JLabel titleLabel = new JLabel("Calculator");
        titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(titleLabel);
        
        // Equation label panel with border
        JPanel equationPanel = new JPanel();
        equationPanel.setBackground(Color.white);
        equationPanel.setBorder(BorderFactory.createLineBorder(Color.black)); // Border for the equation panel
        equationPanel.setPreferredSize(new Dimension(400, 40));
        equationPanel.setMaximumSize(new Dimension(400, 40)); // Limit the maximum size to avoid stretching
        
        JLabel equationLabel = new JLabel("0");
        equationLabel.setFont(new Font("Sans-serif", Font.PLAIN, 14));
        equationPanel.add(equationLabel);
        
        this.add(equationPanel); // Add the equation panel to the input box
    }
}
