package org.eaticious.greenlicious;

import java.util.Locale;

import org.eaticious.common.Quantity;

public interface Nutrient {
	
	public String getName();
	
	public String getName(Locale language);
	
	public Quantity getRecommendedDailyConsumption();

}
