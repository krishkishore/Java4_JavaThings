package com.kishore3.innerclasses;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _1ConsumerInterfaceExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3);

		Consumer<Integer> c = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("t" + t);
			}
		};

		list.forEach(c);

	}
}
