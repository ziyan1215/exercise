package com.lysoft.business.demo.web.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = { "org.apache.cxf.feature.FastInfosetFeature"})
public interface HelloWorld {

    String sayHi(@WebParam(name="text")String text);
}
