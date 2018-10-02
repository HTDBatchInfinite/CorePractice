package com.core.Serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException {
		
		//using new Keyword
		Employee new_keyword=new Employee();
		new_keyword.setName("chandu");
		System.out.println(new_keyword + ", hashcode : " + new_keyword.hashCode());
		
		// By using Class class's newInstance() method
		Employee new_Instance=(Employee) Class.forName("com.core.Serialisation.Employee").newInstance();
		new_Instance.setName("siva");
		System.out.println(new_Instance + ", hashcode : " + new_Instance.hashCode());
		
		// By using Constructor class's newInstance() method
		Constructor<Employee> constructor=Employee.class.getConstructor();
		Employee con_instance=constructor.newInstance();
		con_instance.setName("rama");
		System.out.println(con_instance + ", hashcode : " + con_instance.hashCode());
		
		// By using clone() method
		Employee clonedObj = (Employee) con_instance.clone();
		clonedObj.setName("karun");
		System.out.println(clonedObj + ", hashcode : " + clonedObj.hashCode());
		
		// By using Deserialization

		// Serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
		out.writeObject(clonedObj);
		out.close();

		//Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
		Employee emp5 = (Employee) in.readObject();
		in.close();
		emp5.setName("Akash");
		System.out.println(emp5 + ", hashcode : " + emp5.hashCode());
		
	}
	
	

}
