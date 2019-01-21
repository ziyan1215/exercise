package com.xz.myo2o.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xz.myo2o.BaseTest;
import com.xz.myo2o.entity.Area;

/**
* @author 作者
* @version 创建时间：2018年12月6日 上午11:38:20
* 类说明
*/
public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	@Test
	public void testQueryArea() {	
		List<Area> listArea=new ArrayList<Area>();
		listArea=areaDao.queryArea();
		System.out.println(listArea.size());
	}

}
