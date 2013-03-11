package org.eaticious.eaternity;


import java.util.List;
import java.util.Map;
import org.eaticious.common.*;

public interface Ingredient {

	public String getName();
	
	public void getProductClassification();
	
	public Map<String, Nutrient> getNutritionData();
	
	public Quantity getCO2eValue();
	
	public List<Ingredient> getAlternatives();
	
	/**
	 * probably implementable with Growth Degree Days
	 * @return
	 */
	public Map<Region,Season> getSeasons();
	
	/**
	 * 
	 * @return specific weight of ingredient for correct volume - weight transformation (EL, TL to grams)
	 */
	public Double getDensity();
	
	
	// eaternity specific
	public Quantity getStdWeight();
	
	public Extraction getStdExtraction();
	
	public List<Extraction> getExtractions();
	
	public List<Production> getProductions();
	
	public List<Transportation> getTransportations();
	
	public List<Condition> getConditions();
	
	public List<String> getTags();
}
