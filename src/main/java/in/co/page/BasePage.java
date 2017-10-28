package in.co.page;

import in.co.dto.BaseBean;

public class BasePage {

	protected String id =null;

	private String[] ids;
	private String operation;
	
	/**
	 * Current page number
	 */
	private int pageNo = 1;

	/**
	 * Number of records displayed on list page
	 */
	private int pageSize =10;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * Value of button clicked
	 */
	
	
	
	
	/**
	 * Converts  page(form) into BaseBean(DTO).
	 * 
	 * @return
	 */
	public BaseBean getBean() {
		return null;
	}

	/**
	 * Converts dto(BEan) into page(form).
	 * 
	 * @param bDto
	 */
	public void populate(BaseBean bBean) {

	}

	public BasePage() {
		super();
		// TODO Auto-generated constructor stub
	}

}
