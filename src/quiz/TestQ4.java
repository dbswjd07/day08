package quiz;

import java.util.Scanner;

public class TestQ4 {
	public int myinput() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력");
		int num = input.nextInt();
		
		return num;
	}
	
	public int prime(int num) {
		int cnt=0;
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				//System.out.println(i+"약수");
				cnt++;
			}else {
				//System.out.println(i+"약수 아님");
			}
		
		}
		
		return cnt;
	}
	
	public void print(int cnt) {
		if(cnt==2) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수 아님");
		}
	}
}
