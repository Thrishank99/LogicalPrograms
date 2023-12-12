package com.convertion.examples;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	private String designation;
	
	public void setEmpId(int empId){
		this.empId=empId;
	}
public int getEmpId(){
	return empId;
}

public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Employee(int empId, String empName, double salary, String designation) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.designation = designation;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation=" + designation
			+ "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((designation == null) ? 0 : designation.hashCode());
	result = prime * result + empId;
	result = prime * result + ((empName == null) ? 0 : empName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (designation == null) {
		if (other.designation != null)
			return false;
	} else if (!designation.equals(other.designation))
		return false;
	if (empId != other.empId)
		return false;
	if (empName == null) {
		if (other.empName != null)
			return false;
	} else if (!empName.equals(other.empName))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}
}
