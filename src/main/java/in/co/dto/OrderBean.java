package in.co.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class OrderBean extends BaseBean {
	@Id @NotNull
	private String oId;
	@NotNull
	private String oDate;
	@NotNull
	private int oTotal;
	
	public OrderBean() {
		// TODO Auto-generated constructor stub
	}
	public String getoId() {
		return oId;
	}
	
	
	public OrderBean(String oId, String oDate, int oTotal) {
		super();
		this.oId = oId;
		this.oDate = oDate;
		this.oTotal = oTotal;
	}
	public void setoId(String oId) {
		this.oId = oId;
	}
	public String getoDate() {
		return oDate;
	}
	public void setoDate(String oDate) {
		this.oDate = oDate;
	}
	public int getoTotal() {
		return oTotal;
	}
	public void setoTotal(int oTotal) {
		this.oTotal = oTotal;
	}
	@Override
	public String getId() {
		
		return oId;
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
