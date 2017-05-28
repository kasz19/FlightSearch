package org.dao;


import org.pojo.Passenger;
import org.dao.abstracts.AbstractDao;

public class PassengerDao extends AbstractDao<Passenger, String>{

	public PassengerDao(){
		super("passenger.csv", ",");
	}

	@Override
	protected Passenger getObjectFromLine(String line) {
		String [] d = line.split(this.getSplitBy());
		Passenger obj = new Passenger();
		obj.setCode(d[0]);
		obj.setPercentage(new Double(d[1]));
		return obj;
	}

	
}
