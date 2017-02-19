package com.htp.oop;

public class Incapsulation {

	private int a = 5;

	protected boolean isGreaterThenZero(int x) {
		return (x > 0) ? true : false;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
