package com.dk;

import org.apache.log4j.Logger;

public class Main {
	private static final Logger log = Logger.getRootLogger();
	
	public static void main(String ...names)
	{
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
//		StringAlgo algo = new StringAlgo();
//		String answer = algo.shiftTwoChars("hello");
//		System.out.println(answer);
	}

}
