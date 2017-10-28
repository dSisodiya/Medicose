package in.co.page;

import javax.validation.constraints.NotNull;

public class ProPage extends BasePage {
	private String pro_id;
	@NotNull
	private String p_id;
	@NotNull
	private String package_id;
	@NotNull
	private String strengthId;
	@NotNull
	private String price;
	@NotNull
	private String st_available;// stock available
	@NotNull
	private String st_consume;
	@NotNull
	private String pro_isActive;
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getPackage_id() {
		return package_id;
	}
	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}
	public String getStrengthId() {
		return strengthId;
	}
	public void setStrengthId(String strengthId) {
		this.strengthId = strengthId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSt_available() {
		return st_available;
	}
	public void setSt_available(String st_available) {
		this.st_available = st_available;
	}
	public String getSt_consume() {
		return st_consume;
	}
	public void setSt_consume(String st_consume) {
		this.st_consume = st_consume;
	}
	public String getPro_isActive() {
		return pro_isActive;
	}
	public void setPro_isActive(String pro_isActive) {
		this.pro_isActive = pro_isActive;
	}
	
	
}
