/**
 * ServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service.model;

public class ServiceSoapBindingSkeleton implements com.service.model.Service, org.apache.axis.wsdl.Skeleton {
    private com.service.model.Service impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://model.service.com", "str"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getService", _params, new javax.xml.namespace.QName("http://model.service.com", "getServiceReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://model.service.com", "getService"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getService") == null) {
            _myOperations.put("getService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getService")).add(_oper);
    }

    public ServiceSoapBindingSkeleton() {
        this.impl = new com.service.model.ServiceSoapBindingImpl();
    }

    public ServiceSoapBindingSkeleton(com.service.model.Service impl) {
        this.impl = impl;
    }
    public java.lang.String getService(java.lang.String str) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getService(str);
        return ret;
    }

}
