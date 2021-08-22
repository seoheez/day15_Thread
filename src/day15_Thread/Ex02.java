package day15_Thread;


class A02 extends Thread{
    public void run() {
            for(int i=0;i<100;i++) {
                    System.out.println("A02 : "+i);
            }
    }
}

class B02 extends Thread{
    public void run() {
            for(int i=0; ;i++) {
                    System.out.println("음악이 흘러나옵니다~ "+i);
            }
    }
}
/*
class A {
	public void start() {
		System.out.println("부모 start 실행");
		run();
	}
	public void run() {
		System.out.println("부모 run 실행");
	}
}

class B extends A {
	public void run() {
		System.out.println("자식 run 실행");
	}
}
*/
public class Ex02 {

	
	public static void main(String[] args) {
		/*
		B b = new B();
		b.start(); //자식에 b.start가 없으면 부모 클래스에서 실행. 
				   //run을 실행할 때  똑같이 가지고 있다면 자식클래스 실행
		*/
		A02 a = new A02();
		B02 b = new B02();
		
		a.setDaemon(true);
		b.setDaemon(true);
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		
	}

}
