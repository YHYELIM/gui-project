package gui.project.practice_379;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;//import 제대로 안되어있으면 FlowLayout 생성 안됨

public class FrameTest02 extends JFrame {
    public FrameTest02() {
        setSize(300, 200);
        setTitle("FrameTest02");

        setLayout(new FlowLayout());
        // 배치관리자:컨테이너 안에서 자식 컴포넌트들의 배치를 담당하는 객체
        // 배치관리자도 객체이기 때문에 new로 생성함
        // FlowLayout은 자식 컴포넌트들을 순차적으로 배치하는 배치 관리자임
        // FlowLayout으로 배치관리자를 지정하지 않았다면 버튼이 전체 화면을 차지했을것

        JButton button = new JButton("버튼");
        // new연산자를 이용하여 버튼 객체 생성

        add(button);
        // 이 문장을 실행 함으로써 버튼을 프레임에 추가

        setVisible(true);
        // setVisible은 맨마지막에 문장을 실행하도록 한다

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        FrameTest02 ft2 = new FrameTest02();
    }

}
