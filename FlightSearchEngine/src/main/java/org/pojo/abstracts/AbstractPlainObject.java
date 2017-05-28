package org.pojo.abstracts;

import org.pojo.interfaces.DomainObject;

public abstract class AbstractPlainObject<E> implements DomainObject<E>{

	private E code;
	
	public E getCode(){
		return code;
	}
	
	public void setCode(E id){
		this.code = id;
	}

}
