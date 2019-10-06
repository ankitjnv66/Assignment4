package spring.assignment.Assignment4;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int empId;
	String empName;
	String empEmail;
	String empLocation;
	
	public Employee() {
		
	}
	

	public Employee(int empId, String empName, String empEmail, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empLocation = empLocation;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}


	public String getEmpLocation() {
		return empLocation;
	}


	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empLocation="
				+ empLocation + "]";
	}
	
	

}
