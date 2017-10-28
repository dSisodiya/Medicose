package in.co.controller;

import java.io.Serializable;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class MainController implements Serializable{
	public static final String ADD="SAVE";
	public static final String SAVE="SAVE";
	public static final String DELETE="DELETE";
	public static final String UPDATE="UPDATE";
	public static final String READ="READ";
	public static final String READ_ALL = "READ_ALL";
	 /**
     * Operation constants
     */
	public static final String OP_SAVE = "Save";
	public static final String OP_CANCEL = "Cancel";
	public static final String OP_DELETE = "Delete";
	public static final String OP_LIST = "List";
	public static final String OP_SEARCH = "Search";
	public static final String OP_VIEW = "View";
	public static final String OP_NEXT = "Next";
	public static final String OP_PREVIOUS = "Previous";
	public static final String OP_NEW = "New";
	public static final String OP_GO = "Go";
	public static final String OP_BACK = "Back";
	public static final String OP_LOG_OUT = "Logout";
	public static final String OP_RESET = "Reset";
	public static final String OP_GET_SUBJECT = "Get Subjects";
    public static final String OP_LOGOUT = "Logout";
    public static final String OP_GET = "Get";

    
    /**
     * Loads preloaded data and stores in Model object.
     * @param model
     */
    @ModelAttribute
    public void preload(Model model) {
    }
}
