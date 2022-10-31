package com.raulzaldana.pkg1;
import processing.core.PApplet;


public class Sketch extends PApplet {

	public void settings() {
		size(600, 600);
	}

	public void setup() {}

	public void draw() {
		ellipse(mouseX, mouseY, 50, 50);
	}

}
