package com.dk;

import org.apache.log4j.Logger;

public class StringAlgo {
	private static final Logger log = Logger.getRootLogger();
	
	public String shiftTwoChars(String str)
	{
		log.debug("method started");
		String sub = str.substring(0,2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String sub2 = str.substring(2);
		return sub2 + sub;
	}

}
