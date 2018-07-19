package test_avg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		
		List<StudentVO> list = new ArrayList<>();
		StudentVO st1 = new StudentVO("둘리", 12);
		StudentVO st2 = new StudentVO("마이콜", 62);
		StudentVO st3 = new StudentVO("또치", 43);
		StudentVO st4 = new StudentVO("도우너", 90);
		StudentVO st5 = new StudentVO("희동이", 93);
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
			
		Average avg = new Average();
		System.out.println(avg.getAvg(list));
				
		
		
		
		
			
	}
}
