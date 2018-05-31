package com.pigdroid.javatoproto.samples;

import java.util.Map;

public class MapMessage {

	private Map<String, Integer> testMap;
	private Map<String, POJOMessage> testMap2;

	public Map<String, Integer> getTestMap() {
		return testMap;
	}

	public void setTestMap(Map<String, Integer> testMap) {
		this.testMap = testMap;
	}

	public Map<String, POJOMessage> getTestMap2() {
		return testMap2;
	}

	public void setTestMap2(Map<String, POJOMessage> testMap2) {
		this.testMap2 = testMap2;
	}

}
