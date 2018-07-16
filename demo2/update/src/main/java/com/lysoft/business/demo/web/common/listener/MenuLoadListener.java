package com.lysoft.business.demo.web.common.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lysoft.web.utils.WebExceptionUtils;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class MenuLoadListener implements ServletContextListener{
	
	private final static Logger log = LoggerFactory.getLogger(MenuLoadListener.class);
	
	public void contextDestroyed(ServletContextEvent ctx) {		
		ctx.getServletContext().removeAttribute("menu_engine");
	}
	
	@SuppressWarnings("deprecation")
	public void contextInitialized(ServletContextEvent ctx) {		
		log.debug("加载应用("+ctx.getServletContext().getContextPath()+")菜单模板");
		String development=ctx.getServletContext().getInitParameter("development");
		try{					
			
			Configuration cfg = new Configuration();
			cfg.setDefaultEncoding("UTF-8");
			if(!"true".equals(development)){
				cfg.setTemplateUpdateDelay(60000);//缓存模板文件  
				cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
			}else{
				cfg.setTemplateUpdateDelay(0); //不缓存模板文件  
			    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
			}
			//cfg.setObjectWrapper(ObjectWrapper.BEANS_WRAPPER);
			/*StringTemplateLoader stringLoader = buildTemplateLoader(ctx);			
			cfg.setTemplateLoader(stringLoader);*/
			
			cfg.setServletContextForTemplateLoading(ctx.getServletContext(), "/WEB-INF/cfg");
			//cfg.setObjectWrapper(new DefaultObjectWrapper());
			ctx.getServletContext().setAttribute("menu_engine", cfg);			
		}catch(Exception e){
			log.error(WebExceptionUtils.getStackTrace(e));
		}
	}
	
/*	private StringTemplateLoader buildTemplateLoader(ServletContextEvent ctx){
		StringTemplateLoader stringLoader = new StringTemplateLoader();
		InputStream m_is=null;		
		try{
			m_is=ctx.getServletContext().getResourceAsStream("/WEB-INF/cfg/menu.ftl");
			String menu_setting=IOUtils.toString(m_is);
			stringLoader.putTemplate("menu.ftl", menu_setting);					
		}catch(Exception e){			
			IOUtils.closeQuietly(m_is);
		}		
		return stringLoader;
	}*/
}