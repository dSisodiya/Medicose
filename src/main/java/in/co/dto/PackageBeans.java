package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="")
public class PackageBeans extends BaseBean {
	@Id @NotNull
	private String package_id;
		
	@NotNull
	private String package_name;
	
	
	
	
	public PackageBeans() {
	
		// TODO Auto-generated constructor stub
	}

	public PackageBeans(String package_id, String package_name) {
		super();
		this.package_id = package_id;
		this.package_name = package_name;
	}

	public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	@Override
	public String getId() {
		
		return package_id;
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
