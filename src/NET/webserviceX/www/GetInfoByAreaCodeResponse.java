/**
 * GetInfoByAreaCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class GetInfoByAreaCodeResponse  implements java.io.Serializable {
    private NET.webserviceX.www.GetInfoByAreaCodeResponseGetInfoByAreaCodeResult getInfoByAreaCodeResult;

    public GetInfoByAreaCodeResponse() {
    }

    public GetInfoByAreaCodeResponse(
           NET.webserviceX.www.GetInfoByAreaCodeResponseGetInfoByAreaCodeResult getInfoByAreaCodeResult) {
           this.getInfoByAreaCodeResult = getInfoByAreaCodeResult;
    }


    /**
     * Gets the getInfoByAreaCodeResult value for this GetInfoByAreaCodeResponse.
     * 
     * @return getInfoByAreaCodeResult
     */
    public NET.webserviceX.www.GetInfoByAreaCodeResponseGetInfoByAreaCodeResult getGetInfoByAreaCodeResult() {
        return getInfoByAreaCodeResult;
    }


    /**
     * Sets the getInfoByAreaCodeResult value for this GetInfoByAreaCodeResponse.
     * 
     * @param getInfoByAreaCodeResult
     */
    public void setGetInfoByAreaCodeResult(NET.webserviceX.www.GetInfoByAreaCodeResponseGetInfoByAreaCodeResult getInfoByAreaCodeResult) {
        this.getInfoByAreaCodeResult = getInfoByAreaCodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoByAreaCodeResponse)) return false;
        GetInfoByAreaCodeResponse other = (GetInfoByAreaCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInfoByAreaCodeResult==null && other.getGetInfoByAreaCodeResult()==null) || 
             (this.getInfoByAreaCodeResult!=null &&
              this.getInfoByAreaCodeResult.equals(other.getGetInfoByAreaCodeResult())));
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
        if (getGetInfoByAreaCodeResult() != null) {
            _hashCode += getGetInfoByAreaCodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoByAreaCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET", ">GetInfoByAreaCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInfoByAreaCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByAreaCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET", ">>GetInfoByAreaCodeResponse>GetInfoByAreaCodeResult"));
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
