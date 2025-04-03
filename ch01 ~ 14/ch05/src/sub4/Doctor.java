package sub4;

public class Doctor extends Person {

	private String speciaity;
	
	public Doctor(String name, int age, String Speciaity) {
		super(name, age);
		this.speciaity = speciaity;
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며 " + name + " 이고 나이는 " +age +"세 입니다.");
	}
}
