package com.xz.myo2o.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import com.xz.myo2o.entity.Area;

public interface AreaService {

	/**
	 * 
	 * @param area
	 * @return
	 */
	Integer addArea(Area area);



}
