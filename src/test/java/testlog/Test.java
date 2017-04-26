package testlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	private Logger logger = LoggerFactory.getLogger(Test.class);
	
	
	public void test(){
		logger.debug("debug级别");
		logger.info("info级别");
		logger.warn("warn级别");
		logger.error("error级别");
	}
	
	
	public static void main(String[] args) {
		new Test().test();
	}
}
