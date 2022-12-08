package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String nameString;
	private String deptString;
	private int salry;
	private List<Employee> subordinates;
	
	public Employee(String nameString, String deptString, int salry) {
		super();
		this.nameString = nameString;
		this.deptString = deptString;
		this.salry = salry;
		subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	public void remove(Employee e) {
		subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name= " + nameString + ", dept= " + deptString + ", salry= " + salry +" ]";
	}

}
