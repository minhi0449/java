package bubble.test.ex02;

import javax.swing.*;

public class Player implements Moveable {
    // x, y 라는 메모리 공간만 만든 거야
    private int x;
    private int y;

    // 플레이어를 이미지 아이콘으로 보여주는 거
    private ImageIcon playerR, playerL;

    // 가장 먼저 실행되는 코드가 생성자
    public Player(){
        // 생성자의 순서도 중요함
        initData();
        setInitLayout();
    }

    private void initData(){
        // 어떤 값을 초기화 할 거냐면?
        playerR = new ImageIcon("images/playerR.png");
        playerL = new ImageIcon("images/playerL.png");
    }

    private void setInitLayout(){}

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
