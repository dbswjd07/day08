package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQ3 {
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
		for(int i=0;i<num.size();i++) {
			if(num.get(i)%3==0) {
				System.out.println(num.get(i)+" (3의 배수)");
			}else {
				System.out.println(num.get(i)+" (3의 배수 아님)");
			}
		}
	}

}
