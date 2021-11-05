package OOP_Encapsulation;

public class Company {
	
	private String name; //global variable -this is a class variable. 
	private int empCount;
	private String hq;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public String getHq() {
		return hq;
	}
	public void setHq(String hq) {
		this.hq = hq;
	} 
	
	
}
