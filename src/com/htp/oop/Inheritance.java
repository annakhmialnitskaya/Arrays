package com.htp.oop;

public class Inheritance extends Incapsulation {

	@Override
	protected boolean isGreaterThenZero(int x) {
		return (x > 0 && x < 100) ? true : false;
	}
}
