package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="")
public class ManufactureBean extends BaseBean{

	@Id @NotNull
	private String manu_id;
	
	@NotNull
	private String manu_name;
	
	
	public ManufactureBean() {
			}
	

	public String getManu_id() {
		return manu_id;
	}

	public ManufactureBean(String manu_id, String manu_name) {
		super();
		this.manu_id = manu_id;
		this.manu_name = manu_name;
	}


	public void setManu_id(String manu_id) {
		this.manu_id = manu_id;
	}

	public String getManu_name() {
		return manu_name;
	}

	public void setManu_name(String manu_name) {
		this.manu_name = manu_name;
	}

	@Override
	public String getId() {
		
		return manu_id;
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
