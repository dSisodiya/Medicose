package in.co.page;

import javax.validation.constraints.NotNull;

public class OrderItemPage {
	private String oId;
	@NotNull
	private String pro_id;
	@NotNull
	private int quantity;
	@NotNull
	private String isDeliverd;
	public String getoId() {
		return oId;
	}
	public void setoId(String oId) {
		this.oId = oId;
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getIsDeliverd() {
		return isDeliverd;
	}
	public void setIsDeliverd(String isDeliverd) {
		this.isDeliverd = isDeliverd;
	}
	
	
}
