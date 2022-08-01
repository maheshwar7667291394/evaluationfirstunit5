package question1;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	private int empId;
	 private String name;
	private String address;
	public Employee() {}
	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getName().compareTo(o2.getName())>0)
			return +1;
		else if(o1.getName().compareTo(o2.getName())<0)
			return -1;
		else return 0;
					
	}


	
	

}
