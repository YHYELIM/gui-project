package gui.project.ex01;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyLayout3 extends JFrame {
    JButton b1, b2, b3;
    Container cPane;
    CardLayout layoutm;

    public MyLayout3() {
        setTitle("BoarderLayoutTest");
        setSize(300, 150);
        cPane = getContentPane();
        layoutm = new CardLayout();
        setLayout(layoutm);// 컴포넌트 설정

        JButton b1 = new JButton("Card #1");
        JButton b2 = new JButton("Card #2");
        JButton b3 = new JButton("Card #3");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(e -> layoutm.next(cPane));// 람다식을 사용해서 버튼을 눌리면 다음 컴포넌트를 보이게 한다
        b2.addActionListener(e -> layoutm.next(cPane));
        b3.addActionListener(e -> layoutm.next(cPane));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyLayout3 l3 = new MyLayout3();

    }

}
