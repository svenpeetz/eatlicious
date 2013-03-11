package org.eaticious.eaternity;


import java.io.Serializable;

import com.googlecode.objectify.annotation.Id;

public class Condition implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6977365500555091257L;
	@Id Long id;
	public String symbol;
	public Double factor;
	
	private Condition()
	{
		
	}
	
	public Condition(Condition toClone) {
		symbol = new String(toClone.symbol);
		factor = new Double(toClone.factor);
	}
	
    public Condition(String symbol) {
		this.symbol = symbol;
	}
    
    public Condition(String symbol, Double factor) {
    	this.symbol = symbol;
    	this.factor = factor;
	}
}
