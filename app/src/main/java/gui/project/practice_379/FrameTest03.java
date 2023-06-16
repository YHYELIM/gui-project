package gui.project.practice_379;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest03 extends JFrame {
    FrameTest03() {
        JPanel panel = new JPanel();
        // 패널 생성
        panel.setBackground(Color.orange);
        // 패널 배경색 변경

        JButton b1 = new JButton("Button1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button2");
        b2.setBackground(Color.green);

        // panel.add(b1);
        // panel.add(b2);
        // 버튼을 패널에 추가

        add(panel);
        panel.add(b1);
        panel.add(b2);
        // 버튼을 패널에 추가
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FrameTest03 ft3 = new FrameTest03();

    }
}
