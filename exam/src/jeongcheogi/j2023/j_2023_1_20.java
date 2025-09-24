package jeongcheogi.j2023;

// 2023년 1회 기출문제 20번
// 객체지향 캡슐화 및 상속
class Parent {
	int x = 100;
	Parent(){
		this(500);
	}
	Parent(int x){
		this.x = x;
	}
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 4000;
	Child(){
		this(5000);
	}
	Child(int x){
		this.x = x;
	}
}

public class j_2023_1_20 {
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.getX());
	}
}
