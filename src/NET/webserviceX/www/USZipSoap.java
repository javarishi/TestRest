/**
 * USZipSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public interface USZipSoap extends java.rmi.Remote {

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by Zip Code
     */
    public NET.webserviceX.www.GetInfoByZIPResponseGetInfoByZIPResult getInfoByZIP(java.lang.String USZip) throws java.rmi.RemoteException;

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by City
     */
    public NET.webserviceX.www.GetInfoByCityResponseGetInfoByCityResult getInfoByCity(java.lang.String USCity) throws java.rmi.RemoteException;

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by state
     */
    public NET.webserviceX.www.GetInfoByStateResponseGetInfoByStateResult getInfoByState(java.lang.String USState) throws java.rmi.RemoteException;

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by Area Code
     */
    public NET.webserviceX.www.GetInfoByAreaCodeResponseGetInfoByAreaCodeResult getInfoByAreaCode(java.lang.String USAreaCode) throws java.rmi.RemoteException;
}
