package in.co.page;

import javax.validation.constraints.NotNull;

public class OrderPage extends BasePage {
	private String oDate;
	@NotNull
	private int oTotal;
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

}
