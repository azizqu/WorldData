package Database;

public class Country {
	private String code;
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	public float getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	private String name;
	private String continent; //might be enum?
	private String region;
	private float surfaceArea;
	
}
