package com.manjunathshetty.hashmap.main;
import java.lang.reflect.Array;
import java.util.Arrays;


public class HashMap<K,V> {
	
	Object[] hashMap;
	
	
	
	@SuppressWarnings("unchecked")
	public HashMap() {
		
		hashMap=(K[])Array.newInstance(Object.class, 10);
		
		Arrays.fill(hashMap, null);
	}
	public int hash(K key)
	{
		int hashCode=key.hashCode();
		int hashValue=hashCode%hashMap.length;
		if(hashValue<0)
		{
			hashValue+=hashMap.length;
		}
		return hashValue;
	}
	
	public void add(K key,V value)
	{
		int index=hash(key);
		if(hashMap[index]==null)
		{
			HashContainer<K,V> hashContainer=new HashContainer<K,V>(key,value);
			hashMap[index]=hashContainer;
		}
	}
	public V get(K key)
	{
		int index=hash(key);
		@SuppressWarnings("unchecked")
		HashContainer<K, V> hashContainer=(HashContainer<K,V>) hashMap[index];
		return hashContainer.Value;
	}

}
