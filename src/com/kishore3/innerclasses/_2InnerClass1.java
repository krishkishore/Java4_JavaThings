package com.kishore3.innerclasses;

public class _2InnerClass1 {
	int i = 10;

	public void show1() {
		System.out.println("1");
	}

	public class InnerClass {
		int j = 20;

		public void show2() {
			System.out.println("2");
		}
	}

	public static void main(String[] args) {

		_2InnerClass1 ref1 = new _2InnerClass1();
		System.out.println(ref1);
		System.out.println(ref1.i);
		ref1.show1();

		// Non Static Class
		_2InnerClass1.InnerClass ref2 = ref1.new InnerClass();
		System.out.println(ref2);
		System.out.println(ref2.j);
		ref2.show2();
	}

}
