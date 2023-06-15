package gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyLayout4 extends JFrame {
    private JButton b1, b2;

    public MyLayout4() {
        setTitle("Absolute Position Test");
        setSize(300, 150);
        setLayout(null); // 패널의 배치 관리자를 지정하지 않는다= 절대 위치를 사용하겠다

        b1 = new JButton("Button #1");
        add(b1);
        b1.setLocation(50, 30);
        b1.setSize(90, 50);

        b2 = new JButton("Button #2");
        add(b2);
        b2.setBounds(180, 30, 90, 20);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 각 버튼의 위치를 setSize, setBound 메소드 이용하여 지정
    }

    public static void main(String[] args) {
        MyLayout4 l4 = new MyLayout4();
    }

}
