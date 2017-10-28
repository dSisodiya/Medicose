package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class GenricBean extends BaseBean{
	@Id @NotNull
	private String Genric_id;
	@NotNull
	private String Genric_Name;
	
	
	public GenricBean() {
		// TODO Auto-generated constructor stub
	}
	
	public GenricBean(String genric_id, String genric_Name) {
		super();
		Genric_id = genric_id;
		Genric_Name = genric_Name;
	}
	public String getGenric_id() {
		return Genric_id;
	}
	public void setGenric_id(String genric_id) {
		Genric_id = genric_id;
	}
	public String getGenric_Name() {
		return Genric_Name;
	}
	public void setGenric_Name(String genric_Name) {
		Genric_Name = genric_Name;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return Genric_id;
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
