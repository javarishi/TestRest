package com.learn.web;

import java.rmi.RemoteException;

import NET.webserviceX.www.GetInfoByZIPResponseGetInfoByZIPResult;
import NET.webserviceX.www.USZipSoapProxy;
import NET.webserviceX.www.USZipSoapStub;

public class TestClient {

	public static void main(String[] args) {
		try {
			
			USZipSoapProxy proxy = new USZipSoapProxy();
			GetInfoByZIPResponseGetInfoByZIPResult result =	proxy.getInfoByZIP("30080");
		
			System.out.println(result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
