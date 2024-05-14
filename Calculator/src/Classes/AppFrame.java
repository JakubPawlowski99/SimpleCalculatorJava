package Classes;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class AppFrame extends JFrame {

    private InputBox input;
    private NumericButtons numericBtn;
    private FunctionButtons functionBtn;

    public AppFrame() {
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        input = new InputBox(); // Instantiate InputBox
        this.add(input, BorderLayout.NORTH);

        numericBtn = new NumericButtons(input); // Pass input to NumericButtons
        this.add(numericBtn, BorderLayout.CENTER);

        functionBtn = new FunctionButtons(input); // Pass input to FunctionButtons
        this.add(functionBtn, BorderLayout.EAST);

        this.pack(); // Pack the frame
        this.setVisible(true);
    }
}
