package com.cice.tutorialjava.poo.collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
public class Diccionario {


		Map<Character,List<String>> buffer;
		
		
		public Diccionario(String file) throws FileNotFoundException{
			FileInputStream in = new FileInputStream(file);
			Scanner sc = new Scanner(in);
			Load(sc);
			
		}


		private void Load(Scanner sc){
			buffer = new HashMap<Character, List<String>>();
			while(sc.hasNext()){
				String line=sc.nextLine();
				char c = line.charAt(0);
				List<String> l = buffer.get(c);
				if(l==null){
					l=new ArrayList<>();
					buffer.put(c, l);
				}
				l.add(line);
			}
			
		}



}
