package com.xz.myo2o.dao;

import java.util.List;

import com.xz.myo2o.entity.Area;

/**
* @author 作者
* @version 创建时间：2018年12月6日 上午11:28:13
* 类说明
*/
public interface AreaDao {
	
	
	List<Area> queryArea();
	Integer addArea(Area area);
}
