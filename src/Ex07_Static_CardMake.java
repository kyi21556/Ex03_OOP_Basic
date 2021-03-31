import kr.or.bit.Card;

public class Ex07_Static_CardMake {

	public static void main(String[] args) {
		// 카드 53 53장
		// heap메모리에 만들어진다 객체니까
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.h = 80; // static 을 사용함으로써 맨 처음 하나만 쓰면
		c.w = 50; // 나머지까지 다 바뀌어진다.
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		//c.h = 80;  이렇게 하면 각각 53번 해줘야한다
		//c.w = 50;
		c2.cardInfo();
		
		// 고객.. 변심 .. 카드가 작아요
		// 현실세계 53 인쇄....
		
		// 
		// 프로그램 세계
		// 1. 53장 카드 h, w 일일이 변경
		
		// 2. 설계도 변경 (다시 연쇄) 

	}

}
