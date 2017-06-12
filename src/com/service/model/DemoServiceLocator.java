/**
 * DemoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service.model;

public class DemoServiceLocator extends org.apache.axis.client.Service implements com.service.model.DemoService {

    public DemoServiceLocator() {
    }


    public DemoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for demo
    private java.lang.String demo_address = "http://localhost:8080/WebService/services/demo";

    public java.lang.String getdemoAddress() {
        return demo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String demoWSDDServiceName = "demo";

    public java.lang.String getdemoWSDDServiceName() {
        return demoWSDDServiceName;
    }

    public void setdemoWSDDServiceName(java.lang.String name) {
        demoWSDDServiceName = name;
    }

    public com.service.model.Demo getdemo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(demo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdemo(endpoint);
    }

    public com.service.model.Demo getdemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.service.model.DemoSoapBindingStub _stub = new com.service.model.DemoSoapBindingStub(portAddress, this);
            _stub.setPortName(getdemoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdemoEndpointAddress(java.lang.String address) {
        demo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.service.model.Demo.class.isAssignableFrom(serviceEndpointInterface)) {
                com.service.model.DemoSoapBindingStub _stub = new com.service.model.DemoSoapBindingStub(new java.net.URL(demo_address), this);
                _stub.setPortName(getdemoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("demo".equals(inputPortName)) {
            return getdemo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://model.service.com", "demoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://model.service.com", "demo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("demo".equals(portName)) {
            setdemoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
