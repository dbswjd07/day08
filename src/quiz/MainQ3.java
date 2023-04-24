package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainQ3 {
public static void main(String[] args) {
	
	TestQ3 t3 = new TestQ3();
	ArrayList<Integer> num = t3.numInput();
	t3.oddEven(num);
	
}
}
