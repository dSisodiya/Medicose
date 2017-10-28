package in.co.page;

import javax.validation.constraints.NotNull;

public class ProInfoPage extends BasePage{
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

	

}
