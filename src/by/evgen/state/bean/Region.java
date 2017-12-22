package by.evgen.state.bean;

public class Region {

	private String regionName;
	private double square;
	
	
	public Region (String regionName, double square) {
		this.regionName=regionName;		
		this.square=square;
	}
	
	public String getRegionName() {
		return regionName;
	}

	public double getSquare() {
		return square;
	}

}