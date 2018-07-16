package com.lysoft.business.demo.web.common.stripes;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public class BasicActionBean implements ActionBean {
	public static final String UI_ROOT_PREFIX="/WEB-INF/ui";
	private ActionBeanContext context;
	
	@Override
	public ActionBeanContext getContext() {
		return this.context;
	}

	@Override
	public void setContext(ActionBeanContext context) {
		this.context = context;
	}
	
	private String module;
	private String menuItem;
		
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}	
}
