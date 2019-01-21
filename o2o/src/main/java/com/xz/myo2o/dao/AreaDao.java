package com.xz.myo2o.dao;

import java.util.List;

import com.xz.myo2o.entity.Area;

/**
* @author 作者
* @version 创建时间：2018年12月6日 上午11:28:13
* 类说明
*/
public interface AreaDao {
	
	
	/**
	 * used: 查询区域列表
	 * last update time : 2019年1月21日下午2:49:23
	 * return :List<Area>
	 * @return
	 */
	List<Area> queryArea();
	Integer addArea(Area area);
}
