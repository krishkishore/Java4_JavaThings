package com.kishore3.innerclasses;

public class _4AnonymousClass2 {
	public static void main(String[] args) {

		_4AnonymousClass1 ref1 = new _4AnonymousClass1() {
			public void show() {
				System.out.println("Impl2");
			}
		};

		ref1.show();

	}
}
