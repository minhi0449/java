package ch03;

import java.util.Scanner;

public class IfTest04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("성적 입력 : ");
        int score = sc.nextInt();
        System.out.println("score : " + score);

        if (score >= 90 && score <= 100) {
            System.out.println("A 학점입니다.");
        } else if (score >= 80 && score < 90) {
            System.out.println("B 학점입니다.");
        } else if (score >= 70 && score < 80) {
            System.out.println("C 학점입니다.");
        } else if (score >= 60 && score < 90) {
            System.out.println("D 학점입니다.");
        } else if (score >= 0 && score < 60) {
            System.out.println("F 학점입니다.");
        } else if (score < 0 || score > 100) {
            System.out.println("0 ~ 100 사이의 숫자를 입력해 주세요.");
        }

    } // end of main
} // end of class
