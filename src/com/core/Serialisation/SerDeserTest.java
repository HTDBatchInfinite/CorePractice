package com.core.Serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserTest {
	// Serializing an object
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serializing an object
		FileOutputStream fileStream = new FileOutputStream("Rectangle.ser");
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		objectStream.writeObject(new Rectangle(5, 6));
		objectStream.close();
		
		FileInputStream fileInputStream = new FileInputStream("Rectangle.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(
				fileInputStream);
		Rectangle rectangle = (Rectangle) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(rectangle.length);// 5
		System.out.println(rectangle.breadth);// 6
		System.out.println(rectangle.area);// 30
	}
			


}
