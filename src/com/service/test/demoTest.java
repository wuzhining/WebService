package com.service.test;

import java.rmi.RemoteException;

import com.service.model.DemoServiceLocator;
import com.service.model.DemoSoapBindingStub;

public class demoTest {
	public static void main(String[] args) {
		DemoSoapBindingStub binding=null;
		try {
			binding=(DemoSoapBindingStub) new DemoServiceLocator().getdemo();
		} catch (javax.xml.rpc.ServiceException e) {
			if(e.getLinkedCause()!=null){
				e.getLinkedCause().printStackTrace();
			}
		}
		binding.setTimeout(60000);
		try {
			Object a =  binding.getService("大宝","二宝");
			System.out.println(a.getClass().toString());
			} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
