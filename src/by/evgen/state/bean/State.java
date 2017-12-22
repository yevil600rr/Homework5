package by.evgen.state.bean;

public class State {

private String capital;

public String getCapital(City[] cities) {
 for (City city: cities) {
	 if (city.isCapital() == true) {
		 capital = city.getCityName();
		 break;
	 }
 }
 return capital;
}
private int countRegions;
public int getRegionsAmount(City[] cities) {
	countRegions = 0;
	for (City  city: cities) {
		if (city.returnRegionSquare() !=0) {
			countRegions++;
		}
	}
	return countRegions;
}
public void printRegions(City[] cities) {
	double vse=0;
	for (City city : cities) {
		if (city.returnRegionSquare() != 0) {
			vse = vse + city.returnRegionSquare();
			System.out.println(city.returnRegionName() + " obl (square is " + city.returnRegionSquare() + " km2)");
			
		}
	}
	System.out.println("Square of County= " + vse+ "km2");
}
public void printRegionalCenters(City[] cities) {
	System.out.println("\nRegions centers: ");
	for (City city :cities) {
		if (city.isRegioanlCenter()== true) {
			System.out.println(city.getCityName());
		}
	}
}

}