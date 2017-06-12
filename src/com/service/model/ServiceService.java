/**
 * ServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service.model;

public interface ServiceService extends javax.xml.rpc.Service {
    public java.lang.String getserviceAddress();

    public com.service.model.Service getservice() throws javax.xml.rpc.ServiceException;

    public com.service.model.Service getservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
