package com.he.ws.jaxws.user;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.he.model.User;

public class UserServiceClient {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8081/user?wsdl");
			QName qName = new QName("http://user.jaxws.ws.he.com/","UserServiceImplService");
//			QName portName = new QName("http://user.jaxws.ws.he.com/","UserServiceImplPort");
			Service service = Service.create(url,qName);
			UserService userService = service.getPort(UserService.class);
			List<User> users = userService.findUsers(null);
			for (User user : users) {
				System.out.println(user);
			}
			User user = userService.findUserByPrimaryKey(1L);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
