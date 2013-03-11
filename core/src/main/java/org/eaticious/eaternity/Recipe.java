package org.eaticious.eaternity;


import java.util.Locale;
import org.eaticious.common.*;
import java.util.Map;

public interface Recipe {

	/**
	 * 
	 * @param language
	 * @return The name of this Recipe
	 */
	public String getTitel(Locale language);
	
	/**
	 * 
	 * @param language
	 * @return The accompanying phrase of this Recipe
	 */
	public String getSubTitel(Locale language);
	
	/**
	 * 
	 * @param language
	 * @return The cooking instructions for this recipe
	 */
	public String getInstructions(Locale language);
	
	/**
	 * 
	 * @return A Map holding amounts of nutrients per serving of this recipe
	 */
	public Map<Nutrient, Quantity> getNutritionData();
	
	// eaternity specific
	
	public Long getDirectAncestorID();
	
	public boolean isDeleted();
	
	public Long getUserID();
	
	
	
	
	
}
