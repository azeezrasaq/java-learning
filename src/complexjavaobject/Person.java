package complexjavaobject;

import java.util.ArrayList;

import org.json.simple.JSONObject;

public class Person {

	private String FirstName;
	private String LastName;
	private Address address;

	// private String address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		JSONObject obj = new JSONObject();
		obj.put("FirstName", FirstName);
		obj.put("LastName", LastName);
		obj.put("Address", address);

		return obj.toJSONString();
	}

}
