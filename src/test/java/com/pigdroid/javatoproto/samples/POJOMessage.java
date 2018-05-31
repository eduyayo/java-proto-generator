package com.pigdroid.javatoproto.samples;

import java.util.Map;

public class POJOMessage {

	private POJOMessage testNesting;
	private SimpleMessage testNesting2;
	private Map<String, POJOMessage> testNesting3;

	public POJOMessage getTestNesting() {
		return testNesting;
	}

	public void setTestNesting(POJOMessage testNesting) {
		this.testNesting = testNesting;
	}

	public Map<String, POJOMessage> getTestNesting3() {
		return testNesting3;
	}

	public void setTestNesting3(Map<String, POJOMessage> testNesting3) {
		this.testNesting3 = testNesting3;
	}

	public SimpleMessage getTestNesting2() {
		return testNesting2;
	}

	public void setTestNesting2(SimpleMessage testNesting2) {
		this.testNesting2 = testNesting2;
	}

}
