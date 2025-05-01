package _static;

public class Employee {

    private int employeeId;
    private String name;        // 이름
    private String department;  // 부서

    /*
        private int employeeId; ---> 각 직원의 고유 ID 를 저장하는 변수
     */


    // 생성자
    public Employee(String name){
        System.out.println("----- Employee() 생성자 호출 -----");

        /*
            생성자에서는 직원의 이름을 받아 설정하고,  Company 클래스의 static 변수인
            emSerialNumber 를 사용해 직원 ID를 할당합니다.
            그리고 다음 직원을 위해 emSerialNumber 를 1 증가 시킵니다.
         */

        this.name = name;
        // 클래스 변수를 활용해 보자. Company.emSerialNumber
        // 클래스 이름으로 접근할 수 있다.
        employeeId = Company.emSerialNumber;
        Company.emSerialNumber++;
        // employeeId = 1;
    }
    // ---------------------------------------------------------

    /*
        데이터 흐름 :
        Employee 객체가 생성될 떄,
        Company 클래스의 static 변수인 emSerialNumber 값을 가져와
        자신의 employeeId 로 설정합니다.
        그리고 emSerialNumber 를 1 증가시켜서 다음 직원이 다른 ID를 받을 수 있게 합니다.

     */

    // ---------------------------------------------------------

    // getter
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // setter
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
