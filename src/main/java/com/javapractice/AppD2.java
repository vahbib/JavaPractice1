
package com.javapractice;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class AppD2 
{
	public static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String message =  "Hello World!";
        LOG.debug(message + " Will be printed on Debug");
        LOG.info(message + " Will be printed on info");
        LOG.warn(message + " Will be printed on warn");
        LOG.error(message + " Will be printed on error");
        LOG.fatal(message + " Will be printed on fatal");
        LOG.info("Appending String: {}." , message);
        System.out.println(message);
	    // bibhav singh
    }
}