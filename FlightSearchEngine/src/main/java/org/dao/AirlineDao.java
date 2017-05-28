package org.dao;

import java.math.BigDecimal;

import org.pojo.Airline;
import org.dao.abstracts.AbstractDao;

public class AirlineDao extends AbstractDao<Airline, String>{

	public AirlineDao(){
		super("airlines.csv", ",");
	}


	@Override
	protected Airline getObjectFromLine(String line) {
		String [] d = line.split(this.getSplitBy());
		Airline obj = new Airline();
		obj.setCode(d[0]);
		obj.setDescription(d[1]);
		obj.setInfantPrice(new BigDecimal(d[2]));
		return obj;
	}

}
