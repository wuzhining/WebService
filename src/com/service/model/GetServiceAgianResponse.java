/**
 * GetServiceAgianResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service.model;

public class GetServiceAgianResponse  implements java.io.Serializable {
    private java.lang.String getServiceAgianReturn;

    public GetServiceAgianResponse() {
    }

    public GetServiceAgianResponse(
           java.lang.String getServiceAgianReturn) {
           this.getServiceAgianReturn = getServiceAgianReturn;
    }


    /**
     * Gets the getServiceAgianReturn value for this GetServiceAgianResponse.
     * 
     * @return getServiceAgianReturn
     */
    public java.lang.String getGetServiceAgianReturn() {
        return getServiceAgianReturn;
    }


    /**
     * Sets the getServiceAgianReturn value for this GetServiceAgianResponse.
     * 
     * @param getServiceAgianReturn
     */
    public void setGetServiceAgianReturn(java.lang.String getServiceAgianReturn) {
        this.getServiceAgianReturn = getServiceAgianReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServiceAgianResponse)) return false;
        GetServiceAgianResponse other = (GetServiceAgianResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getServiceAgianReturn==null && other.getGetServiceAgianReturn()==null) || 
             (this.getServiceAgianReturn!=null &&
              this.getServiceAgianReturn.equals(other.getGetServiceAgianReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetServiceAgianReturn() != null) {
            _hashCode += getGetServiceAgianReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetServiceAgianResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.service.com", ">getServiceAgianResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getServiceAgianReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.service.com", "getServiceAgianReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
