package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestQ1 {
//	public String[] nameInput() {
//		Scanner input = new Scanner(System.in);
//		String[] name = new String[3];
//		
//		for(int i=0;i<3;i++) {
//			System.out.print("이름 입력: ");
//			name[i] = input.next();
//		}
//		
//		return name;
//	}
//	
//	
//	public String[] print(String[] name) {
//		for(int i=0;i<3;i++) {
//			System.out.println("이름: "+name[i]);
//		}
//		
//		return name;
//	}
	
	
//	public ArrayList<String> nameInput() {
//		Scanner input = new Scanner(System.in);
//		ArrayList<String> name = new ArrayList<String>();
//		String n =null;
//		
//		for(int i=0;i<3;i++) {
//			System.out.print("이름 입력: ");
//			n = input.next();
//			name.add(n);
//		}
//		
//		return name;
//	}
//	
//	public void print(ArrayList<String> name) {
//		System.out.println("이름: "+name);
//	}
	
	
	public HashMap<String,String> nameInput() {
		Scanner input = new Scanner(System.in);
		HashMap<String,String>name = new HashMap<>();
		
		for(int i=0;i<3;i++) {
			System.out.print("이름 입력: ");
			String n1=input.next();
			name.put(n1, "이름");
		}
		
		return name;
	}
	
	public void print(HashMap<String, String> name) {
		System.out.println(name);
	}
}
