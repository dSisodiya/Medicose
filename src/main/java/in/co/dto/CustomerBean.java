package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CustomerBean extends BaseBean{
	@Id @NotNull
	private String custId;
	@NotNull
	private String custName;
	@NotNull
	private String custEmail;
	@NotNull
	private String custPhone;
	public String getCustId() {
		return custId;
	}
	
	public CustomerBean() {
		// TODO Auto-generated constructor stub
	}
	public CustomerBean(String custId, String custName, String custEmail, String custPhone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPhone = custPhone;
	}


	public void setCustId(String custId) {
		this.custId = custId;
	}
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
	@Override
	public String getId() {
		// TODO Auto-generated method stub
				return custId;
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
