package gui.project.practice_379;

import javax.swing.JFrame;//스윙 사용을 위한 javax.swing패키지 안에 모든 클래스 포함

public class FrameTest01 extends JFrame {// JFrame을 상속하여서 FrameTest클래스 정의
    public FrameTest01() {// FrameTest01 클래스의 생성자에서 FrameTest01객체를 초기화한다
        setSize(300, 200);
        setTitle("MyFrameTest01");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame f = new FrameTest01();
        // main에서 Frametest01객체 생성 FrameTest 생성자가 호출되면서 모든 작업이 시작
        // main 앞에 static이 붙어서 정적 메소드
        // 정적 메소드는 객체 생성하지 않아도 얼마든지 호출 가능하다

    }

}
