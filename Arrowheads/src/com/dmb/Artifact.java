package com.dmb;
/**
 * This class creates an object of Arrowhead and contains the type of arrowhead,
 * the date it was found, the name of the dig site, the county and state and
 * the name of the finder.  All String variables.
 * Constructors:
 * 	public Artifact(String artType, String dateFound, String locFound, String county, String state, String finderName) 
	{

		super();
		this.artType = artType;
		this.dateFound = dateFound;
		this.locFound = locFound;
		this.county = county;
		this.state = state;
		this.finderName = finderName;
	}

	public Artifact() {}
 * @author dmb
 *
 */
public class Artifact {
	
	String artType;
	String dateFound;
	String locFound;
	String county;
	String state;
	String finderName;
	
	public Artifact(String artType, String dateFound, String locFound, String county, String state, String finderName) 
	{

		super();
		this.artType = artType;
		this.dateFound = dateFound;
		this.locFound = locFound;
		this.county = county;
		this.state = state;
		this.finderName = finderName;
	}

	public Artifact() {}
	
	
	@Override
	public String toString() {
		return "Artifact [artType=" + artType + ", dateFound=" + dateFound + ", locFound=" + locFound + ", county="
				+ county + ", state=" + state + ", finderName=" + finderName + "]";
	}

	public String getArtType() {
		return artType;
	}

	public void setArtType(String artType) {
		this.artType = artType;
	}

	public String getDateFound() {
		return dateFound;
	}

	public void setDateFound(String dateFound) {
		this.dateFound = dateFound;
	}

	public String getLocFound() {
		return locFound;
	}

	public void setLocFound(String locFound) {
		this.locFound = locFound;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFinderName() {
		return finderName;
	}

	public void setFinderName(String finderName) {
		this.finderName = finderName;
	}

}
