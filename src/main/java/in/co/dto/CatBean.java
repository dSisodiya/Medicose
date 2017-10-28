package in.co.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class CatBean extends BaseBean {
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
	public CatBean() {
		// TODO Auto-generated constructor stub
	}
	public CatBean(String catId, String catName) {
		
		this.catId = catId;
		this.catName = catName;
	}
	@Override
	public String getId() {
		
		return catId;
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
	public int compareTo(BaseBean arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "CatBean [catId=" + catId + ", catName=" + catName + "]";
	}
	
}
