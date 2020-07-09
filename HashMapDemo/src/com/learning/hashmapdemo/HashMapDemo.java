package com.learning.hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

//	Map Interface
//	Which is not part of collections 
//	It belongs to java.util package
//	Map works on Key-Value pair
//  Hashmap allows null values as Keys and n number of null values as values
	public static void main(String[] args) {
		Map<Integer, String> dataMap=new HashMap();
		
		dataMap.put(101, "Tanvi Varak");
		dataMap.put(106,"Tanvi Gharte");
		dataMap.put(104,"Tanvi Patil");
		dataMap.put(103, null);
		dataMap.put(null, "Sankalp Oversmart");
		dataMap.put(102, null);
		
		System.out.println(dataMap);
		System.out.println();
		
		//entrySet method returns Set interface which is enabling the 
		//dataMap which is of type Map to be viewed as Collection(Collection-View)
		//it will sort the data implicitly and allow us to view dataMap as Set Interface
		System.out.println(dataMap.entrySet());
		System.out.println();
		
		for(Map.Entry<Integer, String> data:dataMap.entrySet())
		{
			System.out.println(data.getKey()+"  "+data.getValue());
		}

		
		System.out.println(dataMap);
		System.out.println();
	}

}
