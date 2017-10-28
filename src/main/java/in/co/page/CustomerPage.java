package in.co.page;

import javax.validation.constraints.NotNull;

public class CustomerPage extends BasePage {
	
	private String custName;


	private String custEmail;
	
	private String custPhone;
	
	private CustomerAddressPage fullAddress;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public CustomerAddressPage getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(CustomerAddressPage address) {
		this.fullAddress = address;
	}
}
