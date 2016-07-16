package com.he.ws.jaxws.demo;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SimpleDemoClent {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8081/simpleDemo?wsdl");
			QName qName = new QName("http://demo.jaxws.ws.he.com/","SimpleServiceImplService");
			//QName portName = new QName("http://demo.jaxws.ws.he.com/","SimpleServiceImplPort");
			Service service = Service.create(url,qName);
			SimpleService simpleService = service.getPort(SimpleService.class);
			int sum = simpleService.sum(1,2,3);
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
