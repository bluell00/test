package test_avg;

public class StudentVO {
	
	private String name;
	private int math;
	
	public StudentVO() { }
	public StudentVO(String name, int math) {
		this.name = name;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", math=" + math + "]";
	}

}
