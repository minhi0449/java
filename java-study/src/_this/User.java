package _this;

public class User {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("userId_0001", "1234", "김복남", "제주시", "저는 강아진뎁숑?");


        // 생성자 단계별 테스트
        UserInfo u1 = new UserInfo("id1");
        UserInfo u2 = new UserInfo("id2", "pw2");
        UserInfo u3 = new UserInfo("id3", "pw3", "김퐁이");
        UserInfo u4 = new UserInfo("id4", "pw4", "강단비", "제주시");
        UserInfo u5 = new UserInfo("id5", "pw5", "김복남", "제주시", "010-0000-0000");

        u1.showInfo();
        u2.showInfo();
        u3.showInfo();
        u4.showInfo();
        u5.showInfo(); // 전체 정보 출력

        userInfo.showInfo();

    }
}
