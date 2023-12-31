package gui.project.ex01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public ImageLabelTest() {
        setTitle("레이블 테스트");
        setSize(400, 250);

        panel = new JPanel();
        label = new JLabel("Dog");
        ImageIcon icon = new ImageIcon("d://dog.jpg");
        label.setIcon(icon);

        button = new JButton("자세한 정보를 보려면 클릭하세요!");
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        ImageLabelTest t = new ImageLabelTest();
    }

}
