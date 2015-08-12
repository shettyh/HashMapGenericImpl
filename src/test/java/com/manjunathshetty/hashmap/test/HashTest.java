package com.manjunathshetty.hashmap.test;
import java.util.ArrayList;
import java.util.List;

import com.manjunathshetty.hashmap.main.HashMap;


public class HashTest {

	public static void main(String[] args) {
		HashMap<String, String> hashmap=new HashMap<String, String>();
		
		hashmap.add("Name","Manju");
		hashmap.add("Address","BNG");
		hashmap.add("City","INR");
		String val=hashmap.get("Address");
		System.out.println(val);
	}

}
