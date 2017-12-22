package by.evgen.state.bean;

public class City {

	private String cityName;
	private String region;
	private double regionSquare;
	private String district;
	private boolean isCapital;
	private boolean isRegionalCenter;

	public City(String cityName, Region region, District district, boolean isCapital, boolean isRegioanlCenter) {
		this.cityName = cityName;
		this.region = region.getRegionName();
		this.regionSquare = region.getSquare();
		this.district = district.getDistrict();
		this.isCapital = isCapital;
		this.isRegionalCenter = isRegioanlCenter;
	}

	public String getCityName() {
		return cityName;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public double returnRegionSquare() {
		return regionSquare;
	}

	public String returnRegionName() {
		return region;
	}

	public boolean isRegioanlCenter() {
		return isRegionalCenter;
	}

}