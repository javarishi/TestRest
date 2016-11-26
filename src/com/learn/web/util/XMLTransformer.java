package com.learn.web.util;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import com.learn.web.dto.ActorDTO;
import com.learn.web.exception.TestRestException;
import com.thoughtworks.xstream.XStream;

public class XMLTransformer {
	// Logger instance
	private static final Logger logger = Logger.getLogger(XMLTransformer.class);
	// XStream instance used for XML parsing
	private final static XStream xstream = new XStream() {
		{
			autodetectAnnotations(true);
			processAnnotations(ActorDTO.class);
		}
	};
	
	public static void main(String[] args) {
		ActorDTO actor = new ActorDTO();
		actor.setActorId(100);
		actor.setFirstName("Ryan");
		actor.setLastName("Haze");
		
		try {
			System.out.println(XMLTransformer.toXML(actor));
		} catch (TestRestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * toXML - Converts given bean to XML
	 * @param Object
	 * @return String XML value created from given Bean object
	 * @throws XMLParsingException
	 */
	public static String toXML(Object obj) throws TestRestException{
		String xml = null;
		try {
	        xml = xstream.toXML(obj);
		} catch (Exception e) {
			logger.error("XMLParsingException :: " +e.getMessage(), e);
			throw new TestRestException(e);
		}
		return xml;
	}
	/**
	 * fromXML - converts given XML to bean
	 * @param xml
	 * @return bean object 
	 * @throws XMLParsingException
	 */
	public static Object fromXML(String xml) throws TestRestException {
		Object obj = null;
		try {
	        obj = xstream.fromXML(xml);
		} catch (Exception e) {
			logger.error("XMLParsingException :: " +e.getMessage(), e);
			throw new TestRestException(e);
		}
		return obj;
	}
	
	
}
