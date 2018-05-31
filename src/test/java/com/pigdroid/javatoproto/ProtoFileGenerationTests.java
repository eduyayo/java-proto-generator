package com.pigdroid.javatoproto;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.pigdroid.javatoproto.samples.ArrayMessage;
import com.pigdroid.javatoproto.samples.ListMessage;
import com.pigdroid.javatoproto.samples.MapMessage;
import com.pigdroid.javatoproto.samples.POJOMessage;
import com.pigdroid.javatoproto.samples.SimpleMessage;

public class ProtoFileGenerationTests {
	
	private static final Logger LOG = Logger.getLogger(ProtoFileGenerationTests.class);

	@Test
	public void SimpleTest(){
		JavaToProto jtp = new JavaToProto(SimpleMessage.class);
		LOG.info(jtp.toString());
	}
	
	
	@Test
	public void ArrayTest(){
		JavaToProto jtp = new JavaToProto(ArrayMessage.class);
		LOG.info(jtp.toString());
	}
	
	
	@Test
	public void ListTest(){
		JavaToProto jtp = new JavaToProto(ListMessage.class);
		LOG.info(jtp.toString());
	}
	
	
	@Test
	public void MapTest(){
		JavaToProto jtp = new JavaToProto(MapMessage.class);
		LOG.info(jtp.toString());
	}
	
	
	@Test
	public void POJOTest(){
		JavaToProto jtp = new JavaToProto(POJOMessage.class);
		LOG.info(jtp.toString());
	}
	
}
