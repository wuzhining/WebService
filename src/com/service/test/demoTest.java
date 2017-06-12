package com.service.test;

import java.lang.reflect.Field;
import java.rmi.RemoteException;

import com.service.model.DemoServiceLocator;
import com.service.model.DemoSoapBindingStub;
import com.service.model.jsonObject;

public class demoTest {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		DemoSoapBindingStub binding = null;
		try {
			binding = (DemoSoapBindingStub) new DemoServiceLocator().getdemo();
		} catch (javax.xml.rpc.ServiceException e) {
			if (e.getLinkedCause() != null) {
				e.getLinkedCause().printStackTrace();
			}
		}
		binding.setTimeout(60000);
		try {
//			System.out.println(binding.getService("大宝", "二宝"));
			jsonObject a = (jsonObject) binding.getServiceObject("大宝", "二宝");
			System.out.println(a.getClass().getName());
			String name = null;
			Object value = null;
			try {
				Field[] fields = a.getClass().getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					Field example = fields[i];
					example.setAccessible(true);
					name = example.getName();
					value = example.get(a);
					System.out.println("********************************************Object Start!***************************************************");
					System.out.println(name + ":" + value);
					System.out.println("********************************************Object End!***************************************************");
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("********************************************Test Start!**************************************************");
			System.out.println(binding.getService("大宝"));
			System.out.println(binding.getServiceAgian("大宝"));
			System.out.println("********************************************Test End!***************************************************");
//			System.out.println("********************************************Object Start!***************************************************");
//			System.out.println(binding.getServiceObject("大宝", "二宝"));
//			System.out.println("********************************************Object End!***************************************************");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
