package com.kishore1.varargs;

public class _2VarArgs {

	// Using Variable Arguments
	void method1(int... args) {
		for (int i : args) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		_2VarArgs ref = new _2VarArgs();
		ref.method1(10, 20, 30, 40);

	}
}
