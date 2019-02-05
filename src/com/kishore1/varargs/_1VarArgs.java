package com.kishore1.varargs;

public class _1VarArgs {

	// Before Variable Arguments We use like the below code
	void method1(int[] args) {
		for (int data : args) {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		int[] ref1 = { 10, 20, 30 };

		_1VarArgs ref = new _1VarArgs();
		ref.method1(ref1);

	}

}
