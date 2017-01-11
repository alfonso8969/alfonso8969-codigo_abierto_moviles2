package com.cice.tutorialjava.poo.collections;

import java.util.List;

import com.cice.tutorialjava.poo.interfaces.Racional;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaRacionalesTest {
	
	public static void main(String[] args) {
	
	List<String> myStringList = new ArrayList<>();
	@SuppressWarnings("unused")
	List<Racional> myRacionalList=new ArrayList<>();
	myStringList.add("Luis");
	myStringList.add("Luis");
	myStringList.add("Pepe");
	myStringList.add("Jorge");
	
	for(int i=0;i<myStringList.size();i++){
		System.out.println(myStringList.get(i));
		
	}
	for(String str:myStringList){
		System.out.println(str);
	}
	Iterator<String> it = myStringList.iterator();
	while (it.hasNext()) {
		String  str = it.next();
		System.out.println(str);
		
	}
	System.out.println("Racionales");
	Racional r = new Racional();
	myRacionalList.add(new Racional(2, 3));
	myRacionalList.add(new Racional(1, 3));
	myRacionalList.add(new Racional(2, 7));
	myRacionalList.add(new Racional(9, 3));
	myRacionalList.add(new Racional(2, 3));
	myRacionalList.add(new Racional(4, 6));
	System.out.println("Iterador myRacionalList");
	Iterator<Racional> it2 = myRacionalList.iterator();
	while (it2.hasNext()) {
		
		System.out.println(it2.next());
	
}
	
}
}