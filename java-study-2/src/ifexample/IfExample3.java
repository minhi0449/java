package ifexample;

// 성적에 따라 학점 부여하기
public class IfExample3 {
    public static void main(String[] args) {
        int score = 95;
        char grade;


        if (score >= 90){
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("grade는 '" + grade + "' 학점 입니다.");
    }
}
