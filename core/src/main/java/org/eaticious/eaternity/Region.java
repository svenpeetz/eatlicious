package org.eaticious.eaternity;


import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface Region {
	
	public String getFCLCode();
	
	public String getISOCode();
	
	public String getName();
	
	public String getName(Locale language);
	
	public Region getParent();
	
	public List<Region> getChildren();
	
	

}
