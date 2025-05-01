package _static;

public class Company {

    // static 변수는 클래스 변수라고도 한다.

    static int emSerialNumber;
    // 1. 회사 전체에서 공유하는 직원 일련번호를 의미
    // 마치 학교에서 모든 학생이 함께 출석부 번호와 같습니다.
    // 'static' (스태틱, 정적) - 키워드는 "모든 객체가 공유한다" 는 의미


    // main
    public static void main(String[] args) {
        System.out.println("-------- Company() main 함수 호출 --------");

        /*
            main 메서드에서는 4명의 직원을 생성하고, 각 직원의 ID를 출력
            이때, emSerialNumber 를 통해 직원 ID를 부여합니다.
         */

        Employee employee1 = new Employee("김퐁");
        Employee employee2 = new Employee("강단비");
        Employee employee3 = new Employee("김복남");
        Employee employee4 = new Employee("강미미");

        System.out.println("김퐁" + employee1.getEmployeeId());
        System.out.println("강단비" + employee2.getEmployeeId());
        System.out.println("김복남" + employee3.getEmployeeId());
        System.out.println("강미미" + employee4.getEmployeeId());

        /*
            데이터 흐름 :
            Company 클래스의 'emSerialNumber' 는 처음에 0으로 초기화되고,
            직원이 생성될 때마다 이 값이 증가합니다.

            따라서,
            첫 번째 직원 : 0
            두 번째 직원 : 1
            세 번째 직원 : 2
            네 번째 직원 : 3
         */


    } // end of main

}
