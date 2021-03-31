/*
 * 원칙: 생성자는 객체 생성시 1개만 호출 (Car C = new Car() 또는 Car C = new Car(100) 둘다 못한다. 둘중 하나만
 * 하지만 예외적으로
 * this를 활용하면 여러개의 생성자를 호출 할 수 있다.
 * ==================================================
 * 설계도를 만들려면 멤버필드, 인스트럭터, 메소드가 있어야한다.
 * 설계도 == 클래스 == 타입
 * 
 *속성 + 기능
 *
 *클래스
 *정보
 *정보를 초기화하는것
 *정보기능
 *
 *member field (캡슐화) 할 수 있다
 *생성자를 초기화 할 수 있다
 *각각의 기능을 줄 수 있다.
 *===================================================
 */

// 아래 코드는 중복이 보인다.
// 값을 할당하는 부분이 중복적으로 보인다. 할당하는 부분을 1개로 표현
/*

	String color;
	String geartype;
	int door;
	
	Zcar(){
		this.color = "red";
		this.geartype = "auto";
		this.door = 2;
	}
	
	Zcar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
	}
}
*/

class Zcar{
    String color;
    String geartype;
    int door;
    
    Zcar(){
        // 생성자를 호출하는 this...
        this("red", "auto", 2);  // 다시 나를 호출하는 것
        System.out.println("default constructor");
    }
    
    Zcar(String color, String geartype, int door){
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor");
    }
    void print() {
        System.out.println(this.door + "/" + this.color + "/" + this.geartype);
    }
}

class Zcar2 {
	   String color;
	   String geartype;
	   int door;
	   
	   Zcar2(){
	      this("red", 1);
	      System.out.println("default constructor");
	   }
	   Zcar2(String color, int door) {
	      this(color, door, "auto");
	      System.out.println("overloading constructor param 2개");
	     
	   }
	   Zcar2(String color, int door, String geartype)  {
	      this.color = color;
	      this.door = door;
	      this.geartype = geartype;
	      System.out.println("overloading contructor param 3개");
	   }
	   void print() {
	      System.out.println(this.color+","+this.geartype+ ","+this.door);
	   }
	}



	public class Ex20_this {

	   public static void main(String[] args) {
	      //Zcar zcar = new Zcar();
	      //zcar.print();

	      //Zcar zcar2 = new Zcar("pink","auto",2);
	      
	      Zcar2 zcar = new Zcar2();
	      zcar.print();
	      //Zcar2 zcar2 = new Zcar2("gold",2);
	      
	      //Zcar2 zcar3 =  new Zcar2("red", 10, "auto");
	   }
	   
	}