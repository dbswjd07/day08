package object;

public class TestClass07 {
	//private: 정보 은닉
	private void test() {}
	public void test1(int num) {
		if(num == 1) {
			System.out.println(111);
			return;
		}
		System.out.println("다음문장실행");
	}
	public int test2(int n) {
		if(n==1) {
			System.out.println("test2 111");
			return 100;
		}else if(n==1) {
			System.out.println("test2 222");
			return 200;
		}else {
			System.out.println("다음문장 실행");
			return 0;
		}
		
		
	}
	public boolean test3(){
		return true;
	}
	
	public int test4() {
		int num = 1;
		if(num==1)
			return num;
		return 0;
	}
	
	public String test5() {
		int num = 1;
		if(num==1)
			return "aaa";
		return null;
	}
}
/*
 - 모든 문제는 main, 연산, 출력하는 기능으로 만드세요
 만약 연산하는 기능이 없으면 연산기능을 빼셔도 됩니다
 	1.3개의 이름을 입력받아 출력 (배열, ArrayList, HashMap)
 	2.입력 값이 짝/홀 구분
 	3.입력 값이 3의 배수 / 아닌지 구분
 	4.입력 값이 소수인지 아닌지 판별
 	5.절대값을 구하는 메소드
 */
