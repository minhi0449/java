package sub01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * 날짜 : 2024/07/24
 * 이름 : 김민희
 * 내용 : HTTP 통신 실습하기
 */
// 목적 : 웹사이트에 HTTP GET 요청을 보내고 응답을 받아서 출력하기
// HTTP GET : 서버로부터 데이터를 가져오는 방식 (조회만 하고 변경하지 않음)
public class HttpGetTest {
	public static void main(String[] args) {
		// 인터넷 요청 보낼 클라이언트 생성
		HttpClient client = HttpClient.newHttpClient();
		
		// 요청 만들기 : GET 방식으로 hanbit.co.kr 주소 요청
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://hanbit.co.kr")) // 주소 입력
				.GET() // GET 방식
				.build(); // 요청 완성
		
		try {
			// 요청 보내고 응답 받기
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			
			// 상태 코드 출력 (예: 200, 301 등)
			System.out.println("상태코드 : " + response.statusCode());
			
			// 응답 본문 출력 (HTML 내용)
			System.out.println("응답내용 : " + response.body());
			
		} catch (IOException e) {
			// 네트워크 문제 등 에러 출력
			e.printStackTrace();
		} catch (InterruptedException e) {
			// 실행 중 중단된 경우 에러 출력
			e.printStackTrace();
		}
		
		// 301 Moved Permanently (영구 이동) - URL이 완전히 바뀜
		
	}
}
