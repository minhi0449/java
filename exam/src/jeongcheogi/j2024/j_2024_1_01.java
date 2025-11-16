package jeongcheogi.j2024;

// 2024년 1회 기출문제
// Singleton Pattern (싱글톤 패턴)
class Soojebi2 {
	static private Soojebi2 instance = null;
	private int count = 0;
	
	static public Soojebi2 get() {
		if(instance == null) {
			instance = new Soojebi2();
		}
		return instance;
	}
	
	public void count() { count++; }
	public int getCount() { return count; }
}
public class j_2024_1_01{
	public static void main(String[] args) {
		Soojebi2 s1 = Soojebi2.get();
		s1.count();
		Soojebi2 s2 = Soojebi2.get();
		s2.count();
		Soojebi2 s3 = Soojebi2.get();
		s3.count();
		s1.count();
		System.out.println(s1.getCount());
	}
}
