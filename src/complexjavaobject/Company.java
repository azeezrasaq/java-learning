package complexjavaobject;

import org.json.simple.JSONObject;

public class Company {

	private String companyName;
	private String companyWebsite;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	@Override
	public String toString() {
		JSONObject obj = new JSONObject();
		obj.put("CompanyName", companyName);
		obj.put("CompanyWebsite", companyWebsite);
		return obj.toJSONString();
	}

}
