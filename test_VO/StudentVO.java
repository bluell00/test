package test_VO;

public class StudentVO {
	
	private String name;
	private int age;
	private int sex;
	private int math;
	
	public StudentVO() { }
	public StudentVO(String name, int age, int sex, int math) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", age=" + age + ", sex=" + sex + ", math=" + math + "]";
	}


	
	
}
