package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProBean extends BaseBean {

	@Id @NotNull
	private String uid;
	@NotNull
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
	
	
	public ProBean() {
		}
	public ProBean(String uid, String pro_id, String p_id, String package_id, String strengthId, String price,
			String st_available, String st_consume, String pro_isActive) {
		super();
		this.uid = uid;
		this.pro_id = pro_id;
		this.p_id = p_id;
		this.package_id = package_id;
		this.strengthId = strengthId;
		this.price = price;
		this.st_available = st_available;
		this.st_consume = st_consume;
		this.pro_isActive = pro_isActive;
	}
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
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	@Override
	public String getId() {
		// 
		return uid;
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
