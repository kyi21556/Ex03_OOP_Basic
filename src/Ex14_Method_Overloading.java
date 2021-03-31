

/*
 * OOP (객체 지향 프로그래밍) >> 설계도 만들기
 * 1. 상속(재사용성)
 * 2. 캡슐화(은닉화 : private(직접할당, 간접할당) >> getter, setter
 * 3. 다형성 : 하나의 타입으로 여러개의 객체 주소를 가지는 것
 * 
 * >> method overloading
 * >> 하나의 이름으로 여러가지 기능을 하는 함수
 * System.out.println() 이 함수가 println() 이름은 1개이지만 기능은 여러개이다.
 * 1. 성능 향상에는 도움을 안준다.
 * 2. 설계자가 개발자의 편리성을 위해서 제공 (편하게 쓰라고 있는 것)
 * 
 * 문법) 함수의 이름은 같고 parameter [개수]와 [타입]을 다르게 만든다.
 * 1. 함수의 이름은 같아야 한다.
 * 2. parameter 갯수 또는 타입은 달라야 한다.
 * 3. return type 은 오버로딩의 판단 기준이 아니다.
 * 4. parameter의 순서가 다름을 인정한다. (주의)
 * 
 * class out{
 *    public void println(){}
 *    public void println(int i){}
 *    public void println(String s){}
 *    
 *    public void println(){}
 *    public void printlnint(int i){}
 *    public void printlnString(String s){}
 * 
 *  둘 중 어떤게 편한가? 위에거가 당연히 편하다.
 */

class Human2 {
	   String name;
	   int age;
	}

	class OverTest {
	   int add(int i) {
	      return 100+i;
	   }
	   //오버로딩
	   int add(int i, int j) {
	      return i+j;
	   }
	   
	   
	   //String add(int j) {
	   //   return "";
	   //}                      함수 뒤로만 보기때문에 얘는 정수 int타입을 받기 때문에 오버로딩 출돌이 난다.
	   String add(String s) { // 얘는  string이라는 타입이 다르기 때문에 오버로딩 가능
	      return "hello" + s;
	   }
	   
	   String add(String s, int i) {//오버로딩 인정
	      return null;
	   }
	   
	   String add(int i, String s) {// 인정( 순서가 다름을 인정한다) 순서가 달라도 오버로딩으로 인정
	      return null;
	   }
	   
	   
	   void add(Human2 human) { //얘는 타입이 다르기 때문에 오버로딩 인정
	      human.name = "홍길동";
	      human.age = 100;
	      System.out.println(human.name + " , " + human.age);
	   }
	   // Human2 add(Human2 h) {} 타입이 같으면 충돌이 난다
	}
	   


	public class Ex14_Method_Overloading {

	   public static void main(String[] args) {
	      OverTest ot = new OverTest();
	      ot.add(100);
	      ot.add(100,200);
	      
	      ot.add(new Human2());
	      
	      String result = ot.add("방가방가");
	      System.out.println(result);
	      
	      
	      
	   }

	}