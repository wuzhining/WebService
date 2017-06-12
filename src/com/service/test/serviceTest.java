package com.service.test;

import java.rmi.RemoteException;

import com.service.model.ServiceServiceLocator;
import com.service.model.ServiceSoapBindingStub;

public class serviceTest {
	public static void main(String[] args) {
		ServiceSoapBindingStub binding=null;
		try {
			binding=(ServiceSoapBindingStub) new ServiceServiceLocator().getservice();
		} catch (javax.xml.rpc.ServiceException e) {
			if(e.getLinkedCause()!=null){
				e.getLinkedCause().printStackTrace();
			}
		}
		binding.setTimeout(60000);
		try {
			System.out.println(binding.getService("大宝"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
