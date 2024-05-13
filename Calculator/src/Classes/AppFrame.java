package Classes;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class AppFrame extends JFrame {
    
    private InputBox input;
    private NumericButtons numericBtn;
    private FunctionButtons funtionBtn;
    
    public AppFrame() {
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        input = new InputBox(); // Instantiate InputBox
        this.add(input, BorderLayout.NORTH);
        
        numericBtn = new NumericButtons();
        this.add(numericBtn, BorderLayout.WEST);
        
        funtionBtn = new FunctionButtons();
        this.add(funtionBtn, BorderLayout.EAST);
        
        this.pack(); // Pack the frame
        this.setVisible(true);
    }
}