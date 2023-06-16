package gui.project.practice_407;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    private JPanel panel;
    private JTextField tfield;
    private JButton[] buttons;
    private String[] labels = {
            "BackSpace", "", "", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "x", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "=" };

    public Calculator() {
        tfield = new JTextField(35);// 글자수 35제한
        panel = new JPanel();
        tfield.setText("0.");
        tfield.setEnabled(false);

        panel.setLayout(new GridLayout(0, 5, 3, 3));
        buttons = new JButton[25];

    }
}
