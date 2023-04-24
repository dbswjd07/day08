package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainQ2 {
public static void main(String[] args) {
	
	TestQ2 t2 = new TestQ2();
	ArrayList<Integer> number = t2.numInput();
	t2.oddEven(number);
	
}
}
