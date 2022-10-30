package com.raulzaldana.pkg2;

public class Main {

	public static void sayHello() {
		System.out.println("Hello from Main class in pkg2");
		Secondary.sayHello();
	}
}
