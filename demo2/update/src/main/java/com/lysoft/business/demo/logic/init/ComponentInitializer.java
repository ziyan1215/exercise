package com.lysoft.business.demo.logic.init;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lysoft.web.service.init.Initializer;
import com.lysoft.web.service.jdbc.butterfly.ButterflyTemplate;

public class ComponentInitializer implements Initializer {
	private final static Logger logger = LoggerFactory
			.getLogger(ComponentInitializer.class);
	private ButterflyTemplate butterflyTemplate = null;
	private ServletContext servletContext=null;
	public static final String MOCK_ROOT_PREFIX="/WEB-INF/mock";
	@Override
	public void init(ServletContext sc, String datasourceKey) {
		logger.debug("datasourceKey:"+ datasourceKey);
		this.servletContext=sc;
		butterflyTemplate = new ButterflyTemplate(datasourceKey);
	}

	@Override
	public ButterflyTemplate getButterflyTemplate() {
		return butterflyTemplate;
	}

	@Override
	public void initData() {

	}

	public ServletContext getServletContext() {
		return servletContext;
	}	
}