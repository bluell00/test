package test_circumferance;

import java.util.Scanner;

public class Circumferance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("개수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.close();			
		
		int x = 2;
		int y = 2;
		
		for(int i = 0; i < num; i++) {
			y = x + y;
			x = y - x;
		}
		System.out.println("둘레 : " + y);
	}
}
