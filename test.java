package test_Cycle;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		String s = sc.nextLine();
		 
		int[] num = new int[2];
		int sum, tmp, count = 0;
		
		if(Integer.parseInt(s) < 10) {
			num[0] = 0;
			num[1] = Integer.parseInt(s);
		} else {
			num[0] = s.charAt(0) - 48;
			num[1] = s.charAt(1) - 48;
		}
			
		while(true) {
			sum = num[0] + num[1];
			tmp = num[1] * 10 + sum % 10;
			count++;
			if(tmp < 10) {
				num[0] = 0;
				num[1] = tmp;
			} else {
				num[0] = tmp / 10;
				num[1] = tmp % 10;
			}
			
			if(Integer.parseInt(s.toString())  == tmp ) {
				System.out.println("cycle = " + count);
				break;
			}	
		}	
	}
}
