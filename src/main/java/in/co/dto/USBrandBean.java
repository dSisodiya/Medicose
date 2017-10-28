package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class USBrandBean extends BaseBean {

	@Id
	private String USB_id;
	private String USB_name;
	
	public USBrandBean() {
		// TODO Auto-generated constructor stub
	}
	

	public USBrandBean(String uSB_id, String uSB_name) {
		super();
		USB_id = uSB_id;
		USB_name = uSB_name;
	}


	public String getUSB_id() {
		return USB_id;
	}

	public void setUSB_id(String uSB_id) {
		USB_id = uSB_id;
	}

	public String getUSB_name() {
		return USB_name;
	}

	public void setUSB_name(String uSB_name) {
		USB_name = uSB_name;
	}

	@Override
	public String getId() {
		
		return USB_id;
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
