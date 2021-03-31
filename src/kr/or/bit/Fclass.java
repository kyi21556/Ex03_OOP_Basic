package kr.or.bit;
/*
 * 클래스 구성요소 ( 필드 + 함수 )
 * 
 * 기능(행위) 만드는 방법
 * 함수(funtion, method)
 * method : 행위 또는 기능을 정의 (최소단위로)
 * - 하나의 함수는 하나의 기능만 구현 가능하다
 * ex) 먹는다, 잔다, 걷는다
 * 함수는 호출에 의해서만 동작한다(누군가 그의 이름을 불러줘야 동작가능하다)
 * ex) 내가 직접 강의실의 형광등 버튼을 눌러야 불이 켜진다.
 * 
 * JAVA)   
 * 1. void, parameter(O)        >> void print(String str) {실행코드}
 *    돈을넣고 게임해도 나에게 돌아오는게 없어 = void 줘바 내가받고 너받어 =parameter 전달해주는 역할
 * 2. void, parameter(X)        >> void print() {실행코드}
 *    (ex: 동전을 넣지 않아도 게임 사용가능)
 * 3. return type, parameter(O) >> int print(int date) {return data + 10}
 *    (ex: 동전을 넣으면 컵이 나와  
 * 4. return type, parameter(X) >> int print(){return 100;}
 *    (ex: 난 너에게 돌려줄거야 근데 받지 않은거야 근데 무엇인가를 돌려줄거야
 *    
 *    void: 돌려주는것이 없다 == return value 가 없다.
 *    return type >> 8가지 기본 타입, Array, class, collection, interface 사용 가능
 *    parameter type >> 8가지 기본 타입, Array, class, collection, interface 사용 가능
 *    
 *    parameter의 갯수는 제한이 없다.
 *    void print(int a, int b, int c, int d){}
 *    >>print(10, 20, 30) (X)
 *    >>print(10, 20, 30, 40)(O)
 *    
 *    ex)
 *    boolean print(boolean b) {return b};
 *    print(false)
 *    
 *    관용적 표현 (선배들이 써봤더니 좋아)
 *    함수의 이름
 *    void a(){} ----(X)
 *    
 *    의미있는 단어의 조합
 *    getChnnelNumber()
 *    getEmpListEmpno()
 *    
 */   
public class Fclass {
	public int data;
	
	
	// 4가지 기본 유형
	
	// 접근자 생략 >> default void m() --2번
	public void m() {
		System.out.println("일반함수 : void(O), parameter(X)");
	}
	
	public void m2(int i) {
			System.out.println("일반함수 : void(O) , parameter(O)");
	}
	
	// 접근자 
	public int m3() {
		return 100; // return type 이 존재하면 반드시 return 키워드를 사용하여 값을 돌려줘야 한다.
	}
	
	public int m4(int data) {
		return 100+data;
	}
	
	// 확장
	public int sum(int i, int j, int k) {
		return i + j + j;
	}
	
	//함수 (접근자 : public이 거의 대부분이다)
	// 함수 접근자 private 쓰는 경우도 있다
	// 만든 설계자의 의도는 : 외부에서 사용하지말고 내부에서만 사용 >> "다른 함수를 도와주는 역할"
	// 결론: 내부에서 사용되는 "공통함수"
	private int subSum(int i) {
		return i + 100;
	}
	
	public void callSubSum() {
		int result = subSum(100); // 내부에서 호출
		System.out.println("call result: " + result);
	}
	
	private int operationMethod(int data) { // 공통 함수
		return data * 200;
	}
	public boolean opSum(int data) {
		// 연산은 다른 함수에게 위임
		// 본인은 논리만 판단
		boolean bo;
		int result = operationMethod(data);
		if(result > 0 ) {
			bo = true;
		} else {
			bo = false;
		}
		return bo;
	}
	
	// Quiz
	// a와 b 둘중에 큰 값을 return 하는 함수를 만드세요.
	// ex) max(300, 100) return 값은 300
	// public int max(int a, int b) {}
	
	public int max(int a, int b) {
		return (a > b) ?  a  :  b;
	}
	
	// 함수의 return type or parameter >> Array, class(사용자 정의 타입)
	public Tv tCall() { // Tv타입의 갖는 [주소값:갖은 타입을 갖는 주소]을 리턴
		// return null; // 난 Tv타입의 객체가 없어(O)
		Tv t = new Tv(); // t라는 변수는 Tv라는 타입 객체가 주소를 가지고 있다.
		t.brandname = "LG";
		System.out.println("t: "+t);
		return t;
		// 위 코드는 개발자가 어떤 생각을 가지고 만든 것일까?
		// 객체에 어떤 값을 세팅해서 보낼때
		
		
		// return new Tv(); // Tv라는 객체의 주소값을 바로 리턴
		// 어떠한 초기화도 없이 주소만 던지는 경우
	}
	
	public void tCall2(Tv t) { // Tv 타입을 갖는 주소값을 parameter
		System.out.println("t 주소 값: "+ t);
	}
	
}
