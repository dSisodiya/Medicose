package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class OrderItemBean  extends BaseBean{
	
	@Id @NotNull
	private String itemId;
	@NotNull
	private String oId;
	@NotNull
	private String pro_id;
	@NotNull
	private int quantity;
	@NotNull
	private String isDeliverd;
	
	public OrderItemBean() {
		// TODO Auto-generated constructor stub
	}

	public OrderItemBean(String itemId, String oId, String pro_id, int quantity, String isDeliverd) {
		super();
		this.itemId = itemId;
		this.oId = oId;
		this.pro_id = pro_id;
		this.quantity = quantity;
		this.isDeliverd = isDeliverd;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

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

	@Override
	public String getId() {
		
		return itemId;
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
