package com.lysoft.business.demo.logic.service;

import java.util.HashMap;
import java.util.Map;

import com.lysoft.framework.core.service.method.params.ValueType;
import com.lysoft.web.service.service.AbstractServiceInvoker;
import com.lysoft.web.service.service.InvokeAnnotation;

public class IndexInvoker  extends AbstractServiceInvoker{
		
	@InvokeAnnotation(name = "index", 
			paramsName = { "userKey" }, 
			paramsType = { ValueType.STRING }, 
			returnType = ValueType.MAP)
	public Map<String,Object> index(final String userKey) {		
		Map<String,Object> result=new HashMap<String,Object>();
		return result;
	}

}