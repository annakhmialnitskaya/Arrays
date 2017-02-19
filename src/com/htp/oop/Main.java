package com.htp.oop;

public class Main {

	public static void main(String[] args) {
		//Flamable f = new Flamable();
		Flamable c = new Candle();
		Flamable t = new Torch();

		t.burn();
		c.burn();
		//f.burn();

	}

}
