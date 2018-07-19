package test_VO;

import java.util.ArrayList;
import java.util.List;

public class AverageMethod {
	
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
	
	public StudentVO getMax(List<StudentVO> list) {
		StudentVO maxScoreStd = new StudentVO();
		for(int i = 0; i < list.size(); i++) {
//			int s = list.get(i).getMath();
			if(maxScoreStd.getMath() < list.get(i).getMath()) {
				maxScoreStd = list.get(i);
			}
		}
		return maxScoreStd;
	}
	
	public List<StudentVO> getRank(List<StudentVO> list) {
		List<StudentVO> ranks = new ArrayList<>();
		
		
		
		return null;	
	}
	
	
	
}
