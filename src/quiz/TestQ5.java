package quiz;

import java.util.Scanner;

public class TestQ5 {
	public int inputNum() {
		Scanner input = new Scanner(System.in);
		int num, n1=0;
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		return num;
	}
	
	public int abNum(int num) {
		if(num<0) {
			num *= -1;
		}
		
		return num;
	}
	
	public void print(int num) {
		System.out.println("절대값: " + num);
	}
}
