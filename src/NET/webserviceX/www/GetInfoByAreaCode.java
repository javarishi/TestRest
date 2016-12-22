/**
 * GetInfoByAreaCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class GetInfoByAreaCode  implements java.io.Serializable {
    private java.lang.String USAreaCode;

    public GetInfoByAreaCode() {
    }

    public GetInfoByAreaCode(
           java.lang.String USAreaCode) {
           this.USAreaCode = USAreaCode;
    }


    /**
     * Gets the USAreaCode value for this GetInfoByAreaCode.
     * 
     * @return USAreaCode
     */
    public java.lang.String getUSAreaCode() {
        return USAreaCode;
    }


    /**
     * Sets the USAreaCode value for this GetInfoByAreaCode.
     * 
     * @param USAreaCode
     */
    public void setUSAreaCode(java.lang.String USAreaCode) {
        this.USAreaCode = USAreaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoByAreaCode)) return false;
        GetInfoByAreaCode other = (GetInfoByAreaCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.USAreaCode==null && other.getUSAreaCode()==null) || 
             (this.USAreaCode!=null &&
              this.USAreaCode.equals(other.getUSAreaCode())));
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
        if (getUSAreaCode() != null) {
            _hashCode += getUSAreaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoByAreaCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET", ">GetInfoByAreaCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET", "USAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
