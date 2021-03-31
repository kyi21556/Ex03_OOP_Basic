/*
 * 1. static member field ( 객체간 공유자원 )
 * 
 * 2. static method : 많이 쓰이니까 객체생성 없이도 편하게 사용하게 해주고 싶어 >> static 
 *    why? : Math.random() 은 왜 Math m = new Math(); m.random();
 *    이렇게 하지 않았을까?
 * 
 */
//import java,lang.*; 은 default 값으로 생략되어있다.

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		// 일반함수에서 
		// cv 값을 가지고 놀 수 있다? 없다?
		// static 자원은 일반자원보다 항상 메모리에 먼저 올라간다.
		cv = 1000;
	}
	
	static void sm() {
		// static 함수에서
		// 일반자원인 iv를 가지고 놀 수 있다
		// iv = 100; >> 생성시점의 문제 때문에 에러가 난다.
		// 에러가 없게 할려면 static은 static끼리 놀아라
		cv = 2222;
	}
	
}

public class Ex09_Static_Method {
	public static void main(String[] args) {
		
		System.out.println(StaticClass.cv);
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		// 일반자원은 객체를 생성해야 한다.
		StaticClass sc = new StaticClass();
		sc.m();
		sc.sm();
		System.out.println(sc.iv);
		System.out.println(sc.cv);
		
		
	}

}
