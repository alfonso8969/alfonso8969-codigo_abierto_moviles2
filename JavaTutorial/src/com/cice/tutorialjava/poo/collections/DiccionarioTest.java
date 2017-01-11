package com.cice.tutorialjava.poo.collections;

import java.io.FileNotFoundException;
import java.util.Iterator;



public class DiccionarioTest {

	public static void main(String[] args) {

		try {
			Diccionario d= new Diccionario("palabras.txt");
			Iterator<Character> it = d.buffer.keySet().iterator();
			while(it.hasNext()){
			  Character key = it.next();
			  System.out.println("Clave: " + key + " -> Valor: " + d.buffer.get(key));
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();	
			}
		catch (NullPointerException e) {
		e.printStackTrace();
		}
	}

}
