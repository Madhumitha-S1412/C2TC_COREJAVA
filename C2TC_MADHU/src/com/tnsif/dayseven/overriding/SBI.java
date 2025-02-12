package com.tnsif.dayseven.overriding;

public class SBI extends RBI {
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}
