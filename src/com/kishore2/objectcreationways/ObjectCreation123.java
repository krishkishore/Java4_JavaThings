package com.kishore2.objectcreationways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation123 {

	public ObjectCreation123() {
		System.out.println("Constructor Called");
	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		// First Way
		ObjectCreation123 ref1 = new ObjectCreation123();
		System.out.println(ref1);
		System.out.println("---------------");

		// Second Way All Possibilities (newInstance() in java.lang package)
		// Load the class in 2 ways and continue second way

		System.out.println(Class.forName("com.kishore.objectcreationways.ObjectCreation123").newInstance());

		ObjectCreation123 ref2 = (ObjectCreation123) Class.forName("com.kishore.objectcreationways.ObjectCreation123")
				.newInstance();
		System.out.println(ref2);

		ObjectCreation123 ref3 = ObjectCreation123.class.newInstance();
		System.out.println(ref3);

		System.out.println("---------------");

		// Third Way (newInstance() of Constructor class in java.lang.reflect)
		ObjectCreation123 ref4 = ObjectCreation123.class.getConstructor().newInstance();
		System.out.println(ref4);

		Constructor<ObjectCreation123> ref5 = ObjectCreation123.class.getConstructor();
		ObjectCreation123 ref6 = ref5.newInstance();
		System.out.println(ref6);

		System.out.println("---------------");
	}
}
