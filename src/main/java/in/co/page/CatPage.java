package in.co.page;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class CatPage extends BasePage   {

	@Id @NotNull
	private String catId;
	@NotNull
	private String catName;
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	public CatPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CatPage(String catId, String catName) {
		super();
		this.catId = catId;
		this.catName = catName;
	}
	
	
}
