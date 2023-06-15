package gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 500);
        setTitle("My Frame");

        this.setLayout(new FlowLayout());

        JButton button = new JButton("버튼");
        this.add(button);// this사용

        JButton button2 = new JButton("버튼");
        this.add(button);// this사용

        JButton button3 = new JButton("버튼");
        this.add(button);// this사용

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();

    }

}
