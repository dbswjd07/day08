package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TestQ2 {
	public ArrayList<Integer> numInput() {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		System.out.print("수 입력: ");
		num.add(input.nextInt());
		System.out.print("수 입력: ");
		num.add(input.nextInt());
		
		return num;
	}
	
	public void oddEven(ArrayList<Integer> num) {
		for(int i=0;i<2;i++) {
			if(num.get(i)%2==0) {
				System.out.println(num.get(i)+"-짝수");
			}else {
				System.out.println(num.get(i)+"-홀수");
			}
		}
	}
	
	
}
