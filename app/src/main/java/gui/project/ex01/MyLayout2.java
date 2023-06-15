package gui.project.ex01;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyLayout2 extends JFrame {
    public MyLayout2() {
        setTitle("GridLayoutTest");
        setSize(300, 150);
        // setLayout(new GridLayout(2, 3));
        setLayout(new GridLayout(3, 2, 3, 3));// 3행2열 //위아래 갭3

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MyLayout2 l2 = new MyLayout2();

    }

}
