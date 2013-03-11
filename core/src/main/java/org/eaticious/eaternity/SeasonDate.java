package org.eaticious.eaternity;


import java.util.Date;

/*
 * Represents a start and ending date of a season
 * month: 1 is January, 12 is December
 * day: 1 is first of month, 31 possibly last
 * 
 */
public interface SeasonDate {


	public boolean setDate(String date);

	public boolean setDate(Date date);

	
	/*
	 * if the dates are same, after returns true as well (still in season)
	 */
	public boolean after(SeasonDate other);

	public boolean before(SeasonDate other);

}

