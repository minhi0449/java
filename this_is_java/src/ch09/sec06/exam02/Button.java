package ch09.sec06.exam02;

public class Button {
	// 정적 중첩 인터페이스
	public static interface ClickListener {
		// 추상 메소드
		void onClick();
	}
	
	private ClickListener clickListener;

	public ClickListener getClickListener() {
		return clickListener;
	}

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
	
}
