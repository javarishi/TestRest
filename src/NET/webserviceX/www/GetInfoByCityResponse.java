/**
 * GetInfoByCityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class GetInfoByCityResponse  implements java.io.Serializable {
    private NET.webserviceX.www.GetInfoByCityResponseGetInfoByCityResult getInfoByCityResult;

    public GetInfoByCityResponse() {
    }

    public GetInfoByCityResponse(
           NET.webserviceX.www.GetInfoByCityResponseGetInfoByCityResult getInfoByCityResult) {
           this.getInfoByCityResult = getInfoByCityResult;
    }


    /**
     * Gets the getInfoByCityResult value for this GetInfoByCityResponse.
     * 
     * @return getInfoByCityResult
     */
    public NET.webserviceX.www.GetInfoByCityResponseGetInfoByCityResult getGetInfoByCityResult() {
        return getInfoByCityResult;
    }


    /**
     * Sets the getInfoByCityResult value for this GetInfoByCityResponse.
     * 
     * @param getInfoByCityResult
     */
    public void setGetInfoByCityResult(NET.webserviceX.www.GetInfoByCityResponseGetInfoByCityResult getInfoByCityResult) {
        this.getInfoByCityResult = getInfoByCityResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoByCityResponse)) return false;
        GetInfoByCityResponse other = (GetInfoByCityResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInfoByCityResult==null && other.getGetInfoByCityResult()==null) || 
             (this.getInfoByCityResult!=null &&
              this.getInfoByCityResult.equals(other.getGetInfoByCityResult())));
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
        if (getGetInfoByCityResult() != null) {
            _hashCode += getGetInfoByCityResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoByCityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET", ">GetInfoByCityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInfoByCityResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByCityResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET", ">>GetInfoByCityResponse>GetInfoByCityResult"));
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
