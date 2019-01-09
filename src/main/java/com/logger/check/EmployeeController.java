package com.logger.check;

import java.util.Date;

import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

public class EmployeeController {
	final static Logger logger = Logger.getLogger(EmployeeController.class);

	public static void main(String[] args) {
		logger.fatal("fatal message");
		logger.error("error message");
		logger.info("info message");
		logger.debug("debug message");
		logger.warn("warn message");
		logger.debug("--------------------------------");
		logger.fatal("fatal message");
		logger.error("error message");
		logger.info("info message");
		logger.debug("debug message");
		logger.warn("warn message");
		logger.debug("--------------------------------");
		logger.fatal("fatal message");
		logger.error("error message");
		logger.info("info message");
		logger.debug("debug message");
		logger.warn("warn message");
		logger.debug("--------------------------------");
		logger.fatal("fatal message");
		logger.error("error message");
		logger.info("info message");
		logger.debug("debug message");
		logger.warn("warn message");
		logger.debug("--------------------------------");
		
		System.out.println("------------------");
		System.out.println("debug message");
		System.out.println("info message");
		System.out.println("warn message");
		System.out.println("error message");
		System.out.println("fatal message");
	}
}
