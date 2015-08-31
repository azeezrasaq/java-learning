package complexjavaobject;




public class SampleArrayList {

	private int id;
	private String FirstName;
	private String LastName;
	private int phoneNumber;

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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString() {

		return "SampleDetail:[ FirstName =" + FirstName + ", LastName= "
				+ LastName + ", PhoneNumber =" + phoneNumber + ", UserId=" + id
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
