package ch02;

// 명령어를 통한 컴파일과 실행
public class HelloWorld2 {

    public static void main(String[] args) {

        System.out.println("Hello World ~~~ !");

        // 컴파일 이란?
        // 개발자가 작성한 xxx.java 파일을 ---> xxx.class 파일을 생성하는 과정을 말한다.
        // 컴파일러는 통역가이다.
        // 프랑스 사람과  ::: (통역가) ::: 한국사람

        // 자바 코드를 작성할 때, 문법에 오류가 있다면 xxx.class 파일을 새롭게 못 만들어 낸다.

        // 컴파일 시점 vs 런타임 시점
        // 컴파일 시점 : 개발자가 문법을 작성하고 .class 파일을 만들어내는 과정을 말한다.
        // 런타임 시점 : 프로그램을 실행시켜서 (10분 실행) 종료하는 순간을 말한다.

        // 명령어를 통해서 java 를 실행시키는 방법은
        // 1. 해당 파일이 있는 폴더로 이동 했다.
        // 2. java HelloWorld2.java 를 실행 시켰다.

        // 명령어를 통해서 컴파일 즉, xxx.class 파일을 만드는 방법은
        // 1. 해당 파일이 있는 폴더로 이동 했다.
        // 2. javac HelloWorld2.java
        // 3. HelloWorld2.class 파일이 생성 된다.

        // ~/Desktop/workspace/java/java-study/src/ch02 (master)$ java HelloWorld2.java
        // Hello World ~~~ ! 출력 완료

    }
}
