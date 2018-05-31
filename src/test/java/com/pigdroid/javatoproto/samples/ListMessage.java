package com.pigdroid.javatoproto.samples;

import java.util.List;
import java.util.Set;

public class ListMessage {

	private List<Integer> testList;
	private Set<Integer> testSet;

	public List<Integer> getTestList() {
		return testList;
	}

	public void setTestList(List<Integer> testList) {
		this.testList = testList;
	}

	public Set<Integer> getTestSet() {
		return testSet;
	}

	public void setTestSet(Set<Integer> testSet) {
		this.testSet = testSet;
	}

}
