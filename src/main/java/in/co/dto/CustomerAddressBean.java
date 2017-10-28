package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
public class CustomerAddressBean extends BaseBean{

	@Id @NotNull
	private String id;
	@NotNull
	private String custId;
	
	@NotNull
	private String address;
	@NotNull
	private String district;
	@NotNull
	private String state;
	@NotNull
	private int pinCode;
	
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustId() {
		return custId;
	}
	
	
	public CustomerAddressBean() {
		// TODO Auto-generated constructor stub
	}

	public CustomerAddressBean(String id,String custId ,String address, String district, String state, int pinCode) {
		super();
		this.id = id;
		this.custId=custId;
		this.address = address;
		this.district = district;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(BaseBean o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
