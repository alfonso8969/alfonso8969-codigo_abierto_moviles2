package com.cice.tutorialjava.poo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cice.tutorialjava.poo.Persona;

public class MapTest {

	public static void main(String[] args) {
	Map<String,Persona> myPersonMap=new HashMap<>();
	myPersonMap.put("p-8001", new Persona("Alfonso", 47, "V"));
	myPersonMap.put("p-8002", new Persona("Pepe", 47, "V"));
	myPersonMap.put("p-8003", new Persona("Ana", 47, "M"));
	myPersonMap.put("p-8004", new Persona("Luis", 47, "V"));
	
 Set<String>Keys= myPersonMap.keySet();
 for(String key:Keys){
	 Persona p = myPersonMap.get(key);
	 p.print();
 }
	}
}
