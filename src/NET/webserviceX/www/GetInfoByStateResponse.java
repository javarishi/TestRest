/**
 * GetInfoByStateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class GetInfoByStateResponse  implements java.io.Serializable {
    private NET.webserviceX.www.GetInfoByStateResponseGetInfoByStateResult getInfoByStateResult;

    public GetInfoByStateResponse() {
    }

    public GetInfoByStateResponse(
           NET.webserviceX.www.GetInfoByStateResponseGetInfoByStateResult getInfoByStateResult) {
           this.getInfoByStateResult = getInfoByStateResult;
    }


    /**
     * Gets the getInfoByStateResult value for this GetInfoByStateResponse.
     * 
     * @return getInfoByStateResult
     */
    public NET.webserviceX.www.GetInfoByStateResponseGetInfoByStateResult getGetInfoByStateResult() {
        return getInfoByStateResult;
    }


    /**
     * Sets the getInfoByStateResult value for this GetInfoByStateResponse.
     * 
     * @param getInfoByStateResult
     */
    public void setGetInfoByStateResult(NET.webserviceX.www.GetInfoByStateResponseGetInfoByStateResult getInfoByStateResult) {
        this.getInfoByStateResult = getInfoByStateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoByStateResponse)) return false;
        GetInfoByStateResponse other = (GetInfoByStateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInfoByStateResult==null && other.getGetInfoByStateResult()==null) || 
             (this.getInfoByStateResult!=null &&
              this.getInfoByStateResult.equals(other.getGetInfoByStateResult())));
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
        if (getGetInfoByStateResult() != null) {
            _hashCode += getGetInfoByStateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoByStateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET", ">GetInfoByStateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInfoByStateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByStateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET", ">>GetInfoByStateResponse>GetInfoByStateResult"));
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
