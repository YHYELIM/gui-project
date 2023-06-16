package gui.project.practice_379;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest04 extends JFrame {
    public FrameTest04() {
        setTitle("FlowLayoutTest");
        setSize(300, 150);
        setLayout(new FlowLayout());// 프레임의 배치 관리자를 FlowLayout으로 지정

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("Button4"));
        add(new JButton("Button5"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FrameTest04 ft4 = new FrameTest04();
    }
    // 컨테이너의 넓이를 다르게 하면 배치가 달라짐 (일자 배치)
}
