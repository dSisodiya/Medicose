package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="")
public class P_InfoBean extends BaseBean {

	@Id @NotNull
	private String p_id;
	
	@NotNull
	private String p_name;
	
	@NotNull
	private String p_genricId;
	
	@NotNull
	private String p_catId;
	
	@NotNull
	private String p_USBId;
	
	@NotNull
	private String p_manuId;
	
	@NotNull
	private String p_packId;
	
	@NotNull
	private String p_isActive;

	
	public P_InfoBean() {
	
		
	}
	public P_InfoBean(String p_id, String p_name, String p_genricId, String p_catId, String p_USBId, String p_manuId,
			String p_packId, String p_isActive) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_genricId = p_genricId;
		this.p_catId = p_catId;
		this.p_USBId = p_USBId;
		this.p_manuId = p_manuId;
		this.p_packId = p_packId;
		this.p_isActive = p_isActive;
	}
	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_genricId() {
		return p_genricId;
	}

	public void setP_genricId(String p_genricId) {
		this.p_genricId = p_genricId;
	}

	public String getP_catId() {
		return p_catId;
	}

	public void setP_catId(String p_catId) {
		this.p_catId = p_catId;
	}

	public String getP_USBId() {
		return p_USBId;
	}

	public void setP_USBId(String p_USBId) {
		this.p_USBId = p_USBId;
	}

	public String getP_manuId() {
		return p_manuId;
	}

	public void setP_manuId(String p_manuId) {
		this.p_manuId = p_manuId;
	}

	public String getP_packId() {
		return p_packId;
	}

	public void setP_packId(String p_packId) {
		this.p_packId = p_packId;
	}

	public String getP_isActive() {
		return p_isActive;
	}

	public void setP_isActive(String p_isActive) {
		this.p_isActive = p_isActive;
	}
	@Override
	public String getId() {
		
		return p_id;
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
