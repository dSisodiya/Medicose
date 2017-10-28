package in.co.page;

import javax.validation.constraints.NotNull;

public class PackagePage extends BasePage{
	
	
	private String package_name;

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
}
