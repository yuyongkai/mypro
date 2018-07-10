package test;

/*(姓名,语文成绩,数学成绩)*/
public class Student {
	private String name;
	private int yuwen;
	private int shuxue;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYuwen() {
		return yuwen;
	}
	public void setYuwen(int yuwen) {
		this.yuwen = yuwen;
	}
	public int getShuxue() {
		return shuxue;
	}
	public void setShuxue(int shuxue) {
		this.shuxue = shuxue;
	}
	/**
	 * @param name
	 * @param yuwen
	 * @param shuxue
	 */
	public Student(String name, int yuwen, int shuxue) {
		super();
		this.name = name;
		this.yuwen = yuwen;
		this.shuxue = shuxue;
	}
	public int getSum(){
		int sum =  yuwen+shuxue;
		return sum;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	
	
}
