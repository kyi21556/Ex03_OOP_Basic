/*
 * class 내부에 : instance variable (member field)
 * method 내부에 : local variable ( 반드시 초기화.. 사용)
 * ex) main(String[] args) >> 함수 >> 안에 모든 변수는 사용시 초기화
 * 
 * Static variable >> 객체간 공유자원 >> 객체 생성 이전에 memory 올라가는 자원
 * (class area 또는 method area)
 * 
 * javac Ex05_variable_scope.java (컴파일)
 * java Ex05_variable_scope       (실행)
 * 
 *  Ex05_variable_scope 정보 >> method(class) area
 *  그때 클래스 static 자원이 있다면 그 자원을 memory road 한다.
 *  
 */

class Variable{
    int iv; // member field, instance variable
    
    void method() {
        int lv = 0; //local variable 반드시 초기화
        
        // for(int i = 0; 여기서 사용되는 i라는 변수는 block variable // for문 안쪽에서 유효하다
    }
    
    static int cv;
    // 1. class variable(클래스 변수), static variable(객체간 공유자원)
    // 2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
    //          heap 영역에 생성된 [객체]들의 [공유자원]이다.
    // 3. 특징 : 접근방법
    // 3.1 class 이름.static 변수명 >> variable.cv >> 누구의 것도 아니다 >> 이유는 객체가 생성되기 전에 접근 가능)
    // 3.2 Variable v = new Variable(); >> v.cv
    //     Variable v2 = new Variable(); >> v2.cv
    //     v.c2 나 v2.cv 가 같은 주소의 메모리 이다.
    // 4. 생성시점 : Hello.java > javac Hello.java > Hello.class
    //   >java.exe Hello 엔터 실행 ...
    //   >class loader System 에 의해서 
    //   클래스를 정보(metadata : 설명) class area(method area) 올려요
    //   --이 클래스 언제 만들었고 어떤 자원을 import 하고 있고   변수 몇개 ...기술 ..
    //   --이 클래스 안에 static variable 또는 static method 있으면 
    //   --이 녀석을 memory (class area) 에 올려 놓는다
    
    //  ★클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸★
    //  편하다고 스태틱으로만 사용하면 성능저하
}

public class Ex05_variable_scope {
    
    public static void main(String[] args) {
        // 시점
        // System.out.println(Variable.cv);
        Variable v = new Variable();
        Variable v2 = new Variable();
        
        Variable.cv = 200;
        
        System.out.println(v.cv);
        System.out.println(v2.cv);
        
    }

}
