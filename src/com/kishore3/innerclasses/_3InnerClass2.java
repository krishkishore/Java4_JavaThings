package com.kishore3.innerclasses;

public class _3InnerClass2 {
	int i = 10;

	public void show1() {
		System.out.println("1");
	}

	public static class InnerClass {

		int j = 20;

		public void show2() {
			System.out.println("2");
		}

		static int k = 30;

		public static void show3() {
			System.out.println("3");
		}
	}

	public static void main(String[] args) {

		_3InnerClass2 ref1 = new _3InnerClass2();
		System.out.println(ref1);
		System.out.println(ref1.i);
		ref1.show1();

		// Static Class
		_3InnerClass2.InnerClass ref2 = new _3InnerClass2.InnerClass();
		System.out.println(ref2);
		System.out.println(ref2.j);
		ref2.show2();

		System.out.println(InnerClass.k);
		InnerClass.show3();
	}
}
