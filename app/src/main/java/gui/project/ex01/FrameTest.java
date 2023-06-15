package gui.project.ex01;

import javax.swing.JFrame;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Test");
        f.setSize(600, 500);
        f.setVisible(true);// 모니터에 그림그린다 //끌 때 데몬도 같이 꺼줘야함
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 창 끌때 데몬도 같이 꺼짐
        // 자체 이름은 프레임인데 컨테이너도 가능
        // 컴포넌트를 감싸고 있는 애들을 컨테이너라고 함
    }
}
// 자체 이름은 프레임인데 컨테이너도 가능
// 컴포넌트를 감싸고 있는 애들을 컨테이너라고 함
// 컨테이너도 컴포넌트가 될수있음
// 컨테이너 위에 컴포넌트
