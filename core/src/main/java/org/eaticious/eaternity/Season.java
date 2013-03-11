package org.eaticious.eaternity;


public interface Season {
	
	public SeasonDate getStart();
	
	public SeasonDate getStop();
	
	public Boolean hasSeason();
	
	public Region getRegion();

}
