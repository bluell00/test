package test_VO;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
	
	public static List<StudentVO> list = new ArrayList<>();
//	public static double getAvg() {
//		return (double) ((list.get(0).getMath() + list.get(1).getMath() + list.get(2).getMath()) / list.size());
//	}
	
	public static void main(String[] args) {
		
		StudentVO st1 = new StudentVO("홍길동", 21, 1, 45);
		StudentVO st2 = new StudentVO("김희선", 21, 2, 88);
		StudentVO st3 = new StudentVO("미나", 21, 2, 95);
		list.add(st1);
		list.add(st2);
		list.add(st3) ;
		
		AverageMethod avg = new AverageMethod();
		System.out.println(avg.getAvg(list));
		
		StudentVO tmp = avg.getMax(list);
		System.out.println(tmp.getName() + ":" + tmp.getMath());
		
		
		

		
		
		
		
		
		
		
		
		
		
	}
}
