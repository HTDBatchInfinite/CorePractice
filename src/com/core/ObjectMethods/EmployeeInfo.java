package com.core.ObjectMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo implements Comparable<EmployeeInfo>{
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getSalary() {
		return salary;
	}
	public EmployeeInfo(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	private int id;
	private String name;
	private long salary;
	@Override
	public int compareTo(EmployeeInfo empInfo) {
		return empInfo.getName().compareTo(this.name);
	}
	public static void main(String[] args) {
		List<EmployeeInfo> list=new ArrayList<EmployeeInfo>();
		list.add(new EmployeeInfo(1, "Chandu", 39000));
		list.add(new EmployeeInfo(2, "Ajay", 38000));
		list.add(new EmployeeInfo(3, "Suresh", 400000));
		
		NameComparator nameComaprator=new NameComparator();
		CustomSort(list,nameComaprator);
		
		IDComapartor idComapartor=new IDComapartor();
		CustomSort(list,idComapartor);
		
		SalaryComapartor salaryComapartor=new SalaryComapartor();
		CustomSort(list,salaryComapartor);
		
	}
	private static void CustomSort(List<EmployeeInfo> list, Comparator<EmployeeInfo> comparator) {
		System.out.println("____________________________");
		System.out.println(comparator.getClass().getName());
		Collections.sort(list,comparator);
		for(EmployeeInfo empInfo :list){
			System.out.println(empInfo.toString());
		}
		System.out.println("____________________________");
		
	}
	

}
class NameComparator implements Comparator<EmployeeInfo> {

	@Override
	public int compare(EmployeeInfo emp1, EmployeeInfo emp2) {
		// TODO Auto-generated method stub
		return emp1.getName().compareTo(emp2.getName());
	}
	
}


class IDComapartor implements Comparator<EmployeeInfo> {

	@Override
	public int compare(EmployeeInfo emp1, EmployeeInfo emp2) {
		// TODO Auto-generated method stub
		return emp1.getId()-emp2.getId();
	}
	
}

class SalaryComapartor implements Comparator<EmployeeInfo> {

	@Override
	public int compare(EmployeeInfo emp1, EmployeeInfo emp2) {
		// TODO Auto-generated method stub
		return (int) ((int) emp1.getSalary()-emp2.getSalary());
	}
	
}
