package org.dao.interfaces;

import java.util.Map;

import org.pojo.interfaces.DomainObject;

public interface DaoInterface <T extends DomainObject<E>, E>{
	Map <E, T> getRecords();
	T getByCode(E code);
	String getFileName();
}
