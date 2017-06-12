/**
 * DemoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service.model;

public interface DemoService extends javax.xml.rpc.Service {
    public java.lang.String getdemoAddress();

    public com.service.model.Demo getdemo() throws javax.xml.rpc.ServiceException;

    public com.service.model.Demo getdemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
