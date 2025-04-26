package _static;

public class Main_01 {

    public static void main(String[] args) {
        Employee01 emp1 = new Employee01("직원 1");
        Employee01 emp2 = new Employee01("직원 2");

        // 모든 직원의 유니폼 색깔 출력
        System.out.println("-----------------------------------");
        emp1.introduce();
        emp2.introduce();

        // 유니폼 색 바꾸기 (모든 직원에게 적용됨)
        Employee01.uniformColor = " - Blue";
        System.out.println("-----------------------------------");

        // 모든 직원의 유니폼 색깔 출력
        emp1.introduce();
        emp2.introduce();

    }
}

class Employee01 {
    String name; // 인스턴스 변수 (사람마다 다름)
    static String uniformColor = "Red"; // 클래스 변수 (모두 공유)

    public Employee01(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("이름 : " + name + " , 유니폼 색 : " + uniformColor);
    }
}