package in.co.page;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class ManufaturePage extends BasePage {
	
	
	private String manu_name;
	
	
	public String getManu_name() {
		return manu_name;
	}


	public void setManu_name(String manu_name) {
		this.manu_name = manu_name;
	}


	
	
}
