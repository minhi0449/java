package ch03;

/*
    [if - else 문] 문법 (반드시 수행)

    if(조건식) {
        수행문1; // 조건식이 '참'인 경우에 수행됨
    } else {
        수행문2; // 조건식이 '참'이 아닌 경우에 수행됨
    }

 */
public class IfTest02 {
    public static void main(String[] args) {
        int age = 10;
        // if else -> 반드시 하나는 수행이 된다.
        if (age >= 20){
            System.out.println("쫌 아저씨네요!@");
        }else {
            System.out.println("아직 쫌 어리네요!");
        }
    }
}