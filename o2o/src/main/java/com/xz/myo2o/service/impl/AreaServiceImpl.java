package com.xz.myo2o.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xz.myo2o.dao.AreaDao;
import com.xz.myo2o.entity.Area;
import com.xz.myo2o.service.AreaService;

/**
* @author 作者
* @version 创建时间：2018年12月6日 下午4:17:14
* 类说明
*/
@Service
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	private AreaDao areaDao;
	

	@Override
	public Integer addArea(Area area) {
		// TODO Auto-generated method stub
		
		System.out.println(areaDao.addArea(area));
		
		return 1;
	}

}
