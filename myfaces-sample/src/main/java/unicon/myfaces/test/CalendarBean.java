package unicon.myfaces.test;

import javax.faces.bean.ManagedBean;
@ManagedBean
public class CalendarBean {
	
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void submitMethod() {
	}

}
