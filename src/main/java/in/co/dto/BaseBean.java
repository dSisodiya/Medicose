package in.co.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public abstract class BaseBean implements DropdownList,Serializable,Comparable<BaseBean>{
	/*private String catId;
	
	abstract public String getId();*/
	private static final long serialVersionUID = 1L;
	/**
     * Non Business primary key
     */
    @Id
    @GenericGenerator(name = "hiIncrement", strategy = "increment")
    @GeneratedValue(generator = "hiIncrement")
    @Column(name = "ID", unique = true, nullable = false)
    protected String id;
    
    
	/**
     * Contains USER ID who created this database record
     */
    @Column(name = "CREATED_BY", length = 255)
    protected String createdBy;
    /**
     * Contains USER ID who modified this database record
     */
    @Column(name = "MODIFIED_BY", length = 255)
    protected String modifiedBy;
    /**
     * Contains Created Time stamp of database record
     */
    @Column(name = "CREATED_DATETIME")
    protected Timestamp createdDatetime;
    /**
     * Contains Modified Time stamp of database record
     */
    @Column(name = "MODIFIED_DATETIME")
    protected Timestamp modifiedDatetime;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}
	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}
	public Timestamp getModifiedDatetime() {
		return modifiedDatetime;
	}
	public void setModifiedDatetime(Timestamp modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

}
