package com.learn.web;

import java.rmi.RemoteException;

import NET.webserviceX.www.Currency;
import NET.webserviceX.www.CurrencyConvertorSoapProxy;

public class CurrencyTest {

	public static void main(String[] args) {
		try {
			CurrencyConvertorSoapProxy proxy = new CurrencyConvertorSoapProxy();
			double rate = proxy.conversionRate(Currency.USD, Currency.AUD);
			System.out.println("Today's Conversion rate is :: " + rate);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
