package com.lysoft.business.demo.web.ui.shouzhang;


import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import com.lysoft.business.demo.web.common.stripes.BasicActionBean;
import com.lysoft.web.stripes.executor.BasicActionCallBack;
import com.lysoft.web.stripes.executor.LocalServiceActionLogicExecutor;


///

///
@UrlBinding("/shouzhang/index.do")
public class IndexActionBean extends BasicActionBean {
	//注意Logger引用包对程序的影响
	@SuppressWarnings("unused")
	private final static Logger logger =(Logger) LoggerFactory.getLogger(IndexActionBean.class);
	
	@DefaultHandler //net.sourceforge.stripes.action.DefaultHandler
	public Resolution toRole(){
		
	return new LocalServiceActionLogicExecutor().execute(this, new BasicActionCallBack() {
		
		@Override
		public Map<String, Object> preHandle() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Resolution postHandle(Map<String, Object> params, Object result)
				throws Exception {

			// TODO Auto-generated method stub
			return new ForwardResolution(UI_ROOT_PREFIX+ "/shouzhang/index.jsp");
		}
	});
	}
	
}
