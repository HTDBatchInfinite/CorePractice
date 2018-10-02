package com.core.ObjectMethods;

public class CloneOperations {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp=new Employee();
		setData(emp);
		System.out.println("intial emp Data:"+emp);
		Employee emp1=new Employee();
		//shallow cloning
		emp1=emp;
		emp1.setId(2);
		System.out.println("after emp Data:"+emp);
		System.out.println("emp1 data:"+emp1);
		System.out.println("emp Hashcode:"+emp.hashCode());
		System.out.println("emp1 Hashcode:"+emp1.hashCode());
		
		//deep clone
		
		Employee emp2=(Employee) emp.clone();
		System.out.println("emp Hashcode:"+emp.hashCode());
		System.out.println("emp2 Hashcode:"+emp2.hashCode());
		
		emp2.setId(3);
		
		System.out.println("clone emp Data:"+emp);
		
		
	}

	private static void setData(Employee emp) {
		emp.setId(1);
		emp.setName("chandu");
		
	}

}
