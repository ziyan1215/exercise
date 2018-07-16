package com.lysoft.business.web.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.lysoft.business.demo.web.ws.HelloWorld;

public final class TestClient {
	private static final String SERVICE_URL="http://localhost:8080/demo/services/hello_world";
    private TestClient() {
    } 

    public static void main(String args[]) throws Exception {
    	test_jaxwsclient();
        test_jaxwsdynclient();
        //test_jaxws_dispatcher();
    }
    
    private static void test_jaxwsclient() throws Exception{
    	long st=System.currentTimeMillis();
    	JaxWsProxyFactoryBean  soapFactoryBean = new JaxWsProxyFactoryBean();
    	soapFactoryBean.setAddress(SERVICE_URL);
    	soapFactoryBean.setServiceClass(HelloWorld.class);
    	Object o = soapFactoryBean.create();
    	HelloWorld hw = (HelloWorld)o;
        System.out.println(hw.sayHi("World"));

        long et=System.currentTimeMillis();
        System.out.println(et-st);
    }
    private static void test_jaxwsdynclient() throws Exception{
    	JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
    	Client client = dcf.createClient(SERVICE_URL+"?wsdl");
    	 
    	Object[] res = client.invoke("sayHi", "test1");
    	System.out.println("Echo response: " + res[0]);
    }   
    /*private static void test_jaxws_dispatcher() throws MalformedURLException{
    	URL wsdlURL = new URL(SERVICE_URL+"?wsdl");
    	Service service = Service.create(wsdlURL, new QName("HelloWorldService"));
    	Dispatch<Source> disp = service.createDispatch(new QName("HelloWorldPort"), Source.class, Service.Mode.PAYLOAD);
    	 
    	Source request = new StreamSource("<hello/>");
    	Source response = disp.invoke(request);
    }*/
}