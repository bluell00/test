package test_avg;

import java.util.List;

public class Average {
	
	public double getAvg(List<StudentVO> list) {
		int sum = 0, tmp = 0;
		double avg = 0.0;
		for(int i = 0; i < list.size(); i++) {
			tmp = list.get(i).getMath();
			sum += tmp;
		}
		avg = (double)sum / list.size();
		return avg;
	}
	
}
