// static 변수   >> 모든 객체가 같은 값을 가지게 할거야
// instance 변수 >> 모든 객체가 다른 값을 가지게 할거야

class InitTest {
	static int cv = 10;
	static int cv2;
	int iv = 11;
	
	static { // static 블럭(static 초기자 설정 블럭)
		cv = 10; // member field에서 초기화를 하나, 여기서 하나 같은거 아닌가라는 생각을 갖는다.
		cv2 = cv+222; // 하지만 이렇게 변형된(조작된 값) 값을 제공할 수 있다.
	}
	
	{   // instance variable 초기화 블럭
		// new를 통해서 객체가 생성되고 int iv 변수가 메모리에 올라 가고 나서 바로 호출 >> { }
		System.out.println("초기자 블럭");
		if(iv > 10) iv = 100; // if(iv > 10) {iv = 100}; 이랑 같은 뜻
	}
	
}

public class Ex08_Static_Init {

	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		
		// 일반자원
		InitTest inittest = new InitTest();
		System.out.println(inittest.iv);
	}

}
