package by.evgen.state.runner;

import by.evgen.state.bean.City;
import by.evgen.state.bean.Region;
import by.evgen.state.bean.District;
import by.evgen.state.bean.State;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		City[] cities = new City[12];
 
		cities[0] = new City("Minsk", new Region("Minskaya", 348.84), new District("Minskiy"), true, true);
		cities[1] = new City("Grodno", new Region("Grodnenskaya", 141.98), new District("Grodnenskiy"), false, true);
		cities[2] = new City("Brest", new Region("Brestskaya", 146.12), new District("Brestskiy"), false, true);
		cities[3] = new City("Gomel", new Region("Gomelskaya", 139.77), new District("Gomelskiy"), false, true);
		cities[4] = new City("Vitebsk", new Region("Vitebskaya", 134.6), new District("Vitebskiy"), false, true);
		cities[5] = new City("Mogilev", new Region("Mogilevskaya", 118.50), new District("Mogilevskiy"), false, true);
		cities[6] = new City("Bobruysk", new Region("Mogilevskaya", 0), new District("Bobruyskiy"), false, false);
		cities[7] = new City("Lida", new Region("Grodnenskaya", 0), new District("Lidskiy"), false, false);
		cities[8] = new City("Mozyr", new Region("Gomelskaya", 0), new District("Mozyrskiy"), false, false);
		cities[9] = new City("Polotsk", new Region("Vitebskaya", 0), new District("Polotskiy"), false, false);
		cities[10] = new City("Sluck", new Region("Minskaya", 0), new District("Sluckiy"), false, false);
		cities[11] = new City("Baranivichi", new Region("Brestskaya", 0), new District ("Baranovichskiy"), false, false);
		
		State state = new State();
		
		System.out.println("The capital is: " + state.getCapital(cities));
		System.out.println("\nRegions amount: " + state.getRegionsAmount(cities));
		state.printRegions(cities);
		state.printRegionalCenters(cities);
	}

}
