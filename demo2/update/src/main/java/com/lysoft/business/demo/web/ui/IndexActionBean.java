package com.lysoft.business.demo.web.ui;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

import com.lysoft.business.demo.web.common.stripes.BasicActionBean;
import com.lysoft.web.account.Account;
import com.lysoft.web.account.AccountUtils;
import com.lysoft.web.stripes.executor.LocalServiceActionLogicExecutor;
import com.lysoft.web.stripes.executor.BasicActionCallBack;
import com.lysoft.web.subject.UserSubject;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@UrlBinding("/index.do")
public class IndexActionBean extends BasicActionBean{
	private String menuStr;
	private Account account;
	
	public String getMenuStr() {
		return menuStr;
	}
	public void setMenuStr(String menuStr) {
		this.menuStr = menuStr;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


	@DefaultHandler
	public Resolution index() throws IOException, TemplateException {		

		return new LocalServiceActionLogicExecutor().execute(this, new BasicActionCallBack(){
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public Map<String, Object> preHandle() throws Exception{
				String module=getModule();
				System.out.println("get module"+module);
				/*if(module==null||module.trim().equals("")){
					module="jcsjgl";
					setModule(module);
				}*/
				Configuration cfg = (Configuration)getContext().getServletContext().getAttribute("menu_engine");
				Map root = new HashMap();
				UserSubject subject = new UserSubject();
				System.out.println("get account obj");
				account=AccountUtils.getAccount((String)subject.getPrincipal());
				root.put("subject", subject);
				root.put("ctxPath", getContext().getRequest().getContextPath());
				root.put("module", getModule());
				Template temp = cfg.getTemplate("menu.ftl");
				ByteArrayOutputStream outStream = new ByteArrayOutputStream();
				Writer out = new OutputStreamWriter(outStream,"UTF-8");
				temp.process(root, out);
				byte[] menuReslut = outStream.toByteArray();
				String resultStr = new String(menuReslut);
				menuStr=resultStr;
				return null;
			}

			@Override
			public Resolution postHandle(Map<String, Object> params, Object result) throws Exception{							
				return new ForwardResolution(UI_ROOT_PREFIX+ "/index.jsp");
			}			
		});			
	}
}