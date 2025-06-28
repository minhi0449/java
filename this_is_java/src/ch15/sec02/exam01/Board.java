package ch15.sec02.exam01;

public class Board {
	private String subject;	// 제목
	private String content; // 내용
	private String writer;  // 글쓴이
	
	// 생성자 : 제목, 내용, 글쓴이를 받아서 Board 객체 만들기
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// 객체 상태를 문자열로 표현하여 변환
	// 객체의 전체 상태를 한 번에 확인하고 싶을 때, 사용
	// 로그 출력에서 객체 정보를 기록할    때, 사용
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
