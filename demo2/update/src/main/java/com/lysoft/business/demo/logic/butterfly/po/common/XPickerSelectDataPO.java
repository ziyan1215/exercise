package com.lysoft.business.demo.logic.butterfly.po.common;

import com.jenkov.db.itf.mapping.AClassMapping;
import com.jenkov.db.itf.mapping.AGetterMapping;
import com.jenkov.db.itf.mapping.ASetterMapping;

@AClassMapping(tableName = "ZHXG_PUB_XPICKER_SELECTDATA")//选择器历史选择内容统一保存表
public class XPickerSelectDataPO{
	private String pkid;//主键
	private String result;
	private String bzw;//标志位
	
	@AGetterMapping(columnName = "PKID")
	public String getPkid() {
		return pkid;
	}
	@ASetterMapping(columnName = "PKID")
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}
	@AGetterMapping(columnName = "RESULT")
	public String getResult() {
		return result;
	}
	@ASetterMapping(columnName = "RESULT")
	public void setResult(String result) {
		this.result = result;
	}
	@AGetterMapping(columnName = "BZW")
	public String getBzw() {
		return bzw;
	}
	@ASetterMapping(columnName = "BZW")
	public void setBzw(String bzw) {
		this.bzw = bzw;
	}
	
}
