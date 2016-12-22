package NET.webserviceX.www;

public class USZipSoapProxy implements NET.webserviceX.www.USZipSoap {
  private String _endpoint = null;
  private NET.webserviceX.www.USZipSoap uSZipSoap = null;
  
  public USZipSoapProxy() {
    _initUSZipSoapProxy();
  }
  
  public USZipSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initUSZipSoapProxy();
  }
  
  private void _initUSZipSoapProxy() {
    try {
      uSZipSoap = (new NET.webserviceX.www.USZipLocator()).getUSZipSoap();
      if (uSZipSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uSZipSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uSZipSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uSZipSoap != null)
      ((javax.xml.rpc.Stub)uSZipSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public NET.webserviceX.www.USZipSoap getUSZipSoap() {
    if (uSZipSoap == null)
      _initUSZipSoapProxy();
    return uSZipSoap;
  }
  
  public NET.webserviceX.www.GetInfoByZIPResponseGetInfoByZIPResult getInfoByZIP(java.lang.String USZip) throws java.rmi.RemoteException{
    if (uSZipSoap == null)
      _initUSZipSoapProxy();
    return uSZipSoap.getInfoByZIP(USZip);
  }
  
  public NET.webserviceX.www.GetInfoByCityResponseGetInfoByCityResult getInfoByCity(java.lang.String USCity) throws java.rmi.RemoteException{
    if (uSZipSoap == null)
      _initUSZipSoapProxy();
    return uSZipSoap.getInfoByCity(USCity);
  }
  
  public NET.webserviceX.www.GetInfoByStateResponseGetInfoByStateResult getInfoByState(java.lang.String USState) throws java.rmi.RemoteException{
    if (uSZipSoap == null)
      _initUSZipSoapProxy();
    return uSZipSoap.getInfoByState(USState);
  }
  
  public NET.webserviceX.www.GetInfoByAreaCodeResponseGetInfoByAreaCodeResult getInfoByAreaCode(java.lang.String USAreaCode) throws java.rmi.RemoteException{
    if (uSZipSoap == null)
      _initUSZipSoapProxy();
    return uSZipSoap.getInfoByAreaCode(USAreaCode);
  }
  
  
}