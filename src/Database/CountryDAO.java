package Database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CountryDAO {

	public ArrayList<Country> retrieveAllCountries(){
		ArrayList<Country> countries = new ArrayList<Country>();
		dBManager dbm = new dBManager();
		ResultSet rs = dbm.executeQuery("SELECT code, Name, Continent, Region, SurfaceArea FROM world.Country;");
		try {
			while(rs.next()) {
				Country c = new Country();
				
				c.setCode(rs.getString("code"));
				c.setName(rs.getString("Name"));
				c.setContinent(rs.getString("Continent"));
				c.setRegion(rs.getString("Region"));
				c.setSurfaceArea(rs.getFloat("SurfaceArea"));
				
				countries.add(c);
			}
		}catch(Exception e) {
			System.out.println("Error Retrieving Countries "+e);
		}
		return countries;
	}
}
