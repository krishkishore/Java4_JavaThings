package com.kishore2.objectcreationways;

public class ObjectCreation45 implements Cloneable {

	int i = 10;

	public ObjectCreation45() {
		System.out.println("Constructor Called");
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		// Fouth Way Cloning
		ObjectCreation45 ref1 = new ObjectCreation45();
		System.out.println(ref1);
		System.out.println(ref1.i);

		Object ref2 = ref1.clone();
		System.out.println(ref2);

		ObjectCreation45 ref3 = (ObjectCreation45) ref2;
		System.out.println(ref3);
		System.out.println(ref3.i);

		// Fifth way Deserialization (First perform Serialization)
	}
}
