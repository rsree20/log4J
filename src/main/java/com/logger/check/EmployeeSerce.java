package com.logger.check;

import org.apache.log4j.Logger;

public class EmployeeSerce {

	final static Logger logger = Logger.getLogger(EmployeeSerce.class);

	public static void main(String[] args) {
		logger.fatal("fatal message from service");
		logger.error("error message from service");
		logger.info("info message from service");
		logger.debug("debug message from service");
		logger.warn("warn message from service");
		
		System.out.println("------------------");
		System.out.println("debug message");
		System.out.println("info message");
		System.out.println("warn message");
		System.out.println("error message");
		System.out.println("fatal message");
	}
}
