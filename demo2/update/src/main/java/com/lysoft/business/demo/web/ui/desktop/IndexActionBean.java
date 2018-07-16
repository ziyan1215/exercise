package com.lysoft.business.demo.web.ui.desktop;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lysoft.business.demo.web.common.stripes.BasicActionBean;
import com.lysoft.web.stripes.executor.BasicActionCallBack;
import com.lysoft.web.stripes.executor.LocalServiceActionLogicExecutor;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/desktop/index.do")
public class IndexActionBean extends BasicActionBean{
	@SuppressWarnings("unused")
	private final static Logger logger = LoggerFactory.getLogger(IndexActionBean.class);
	
	@DefaultHandler
	public Resolution toRole() {
		return new LocalServiceActionLogicExecutor().execute(this,new BasicActionCallBack(){
			@Override
			public Map<String, Object> preHandle() throws Exception {
				return null;
			}
			
			@Override
			public Resolution postHandle(Map<String, Object> params, Object result)
					throws Exception {
					
				return new ForwardResolution(UI_ROOT_PREFIX+"/desktop/index.jsp");
			}			
		});		
	}
}