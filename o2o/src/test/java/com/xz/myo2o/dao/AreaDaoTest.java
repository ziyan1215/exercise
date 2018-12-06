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
		Area a =new Area();
		List<Area> l=new ArrayList<Area>();
		l=areaDao.queryArea();
		
		System.out.println(l.size());
	}

}
