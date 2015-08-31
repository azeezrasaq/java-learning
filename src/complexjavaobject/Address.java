package complexjavaobject;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Address {

	private String street1;
	private String street2;
	private String City;
	private String Country;
	private Company company;
	private String County;
	

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		JSONObject obj = new JSONObject();
		obj.put("Street1", street1);
		obj.put("Street2", street2);
		obj.put("City", City);
		obj.put("Country", Country);
		obj.put("Company", company);
		return obj.toJSONString();
	}

}
