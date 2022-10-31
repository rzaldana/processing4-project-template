package com.raulzaldana.pkg1;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hello from the Main class!");

		Secondary.sayHello();

		com.raulzaldana.pkg2.Main.sayHello();

		String[] processingArgs = {"MySketch"};
		Sketch mySketch = new Sketch();
		processing.core.PApplet.runSketch(processingArgs, mySketch);

	}
}
