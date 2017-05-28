package org.pojo;

import org.pojo.abstracts.AbstractPlainObject;

public class Passenger extends AbstractPlainObject<String>{

	private Double percentage;
	
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

}
