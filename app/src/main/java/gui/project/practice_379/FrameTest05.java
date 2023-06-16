package gui.project.practice_379;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest05 extends JFrame {
    public FrameTest05() {
        setTitle("BorderLayoutTest");
        setSize(300, 150);
        setLayout(new BorderLayout());// 프레임의 배치관리자 BorderLayout으로 지정

        JButton b1 = new JButton("South");
        JButton b2 = new JButton("North");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        add(b1, "South");
        add(b2, "North");
        add(b3, "East");
        add(b4, "West");
        add(b5, "Center");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FrameTest05 ft5 = new FrameTest05();
    }
}
