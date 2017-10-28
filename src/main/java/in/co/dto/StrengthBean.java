package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Controller;

@Entity
public class StrengthBean extends BaseBean  {
	@Id @NotNull
	private String strengthId;
	
	@NotNull
	private String strengthName;

	public StrengthBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public StrengthBean(String strengthId, String strengthName) {
		super();
		this.strengthId = strengthId;
		this.strengthName = strengthName;
	}



	public String getStrengthId() {
		return strengthId;
	}


	public void setStrengthId(String strengthId) {
		this.strengthId = strengthId;
	}


	public String getStrengthName() {
		return strengthName;
	}


	public void setStrengthName(String strengthName) {
		this.strengthName = strengthName;
	}


	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return strengthId;
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
