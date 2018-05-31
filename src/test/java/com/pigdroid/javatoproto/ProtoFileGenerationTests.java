package com.pigdroid.javatoproto;

import org.junit.Test;

import com.pigdroid.javatoproto.samples.ArrayMessage;
import com.pigdroid.javatoproto.samples.ListMessage;
import com.pigdroid.javatoproto.samples.MapMessage;
import com.pigdroid.javatoproto.samples.POJOMessage;
import com.pigdroid.javatoproto.samples.SimpleMessage;

public class ProtoFileGenerationTests {

	@Test
	public void SimpleTest(){
		JavaToProto jtp = new JavaToProto(SimpleMessage.class);
		System.out.println(jtp.toString());
	}
	
	
	@Test
	public void ArrayTest(){
		JavaToProto jtp = new JavaToProto(ArrayMessage.class);
		System.out.println(jtp.toString());
	}
	
	
	@Test
	public void ListTest(){
		JavaToProto jtp = new JavaToProto(ListMessage.class);
		System.out.println(jtp.toString());
	}
	
	
	@Test
	public void MapTest(){
		JavaToProto jtp = new JavaToProto(MapMessage.class);
		System.out.println(jtp.toString());
	}
	
	
	@Test
	public void POJOTest(){
		JavaToProto jtp = new JavaToProto(POJOMessage.class);
		System.out.println(jtp.toString());
	}
	
}
