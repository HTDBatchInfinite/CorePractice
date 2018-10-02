package com.core.Serialisation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Rectangle implements Serializable{
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	int length;
	int breadth;
	transient int area;
	private void writeObject(ObjectOutputStream os) throws IOException {
		// Do whatever java does usually when serialization is called
		os.defaultWriteObject();
	}

	private void readObject(ObjectInputStream is) throws IOException,
			ClassNotFoundException {
		// Do whatever java does usually when de-serialization is called
		is.defaultReadObject();
		// In addition, calculate area also
		area = this.length * this.breadth;
	}
}
