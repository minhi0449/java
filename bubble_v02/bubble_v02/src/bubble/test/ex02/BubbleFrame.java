package bubble.test.ex02;

import bubble.test.ex01.Player;
import javax.swing.*;

/*
    2025.02.0
 */

public class BubbleFrame extends JFrame {

    private Player player; // 지금 클래스를 설계하는 중
    private JLabel backgroundMap;

    public BubbleFrame(){
        initData();
    }

    public void initData(){
        super.setSize(1000, 600);
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));

        super.setVisible(true);
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }

}
