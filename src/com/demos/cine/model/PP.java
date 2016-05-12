package com.demos.cine.model;

public class PP {


	public static void main(String[] args) {
	
		Panier p = new Panier();
		
		try{
		Article cassette = new Article ("Cas123","ccc",new Prix(10), 20);
		p.Ajouter(cassette ,20);
		}	catch (Exception e){
			
			System.out.println("article non créé car prix incorrect");
		}
		
		try{
		Article cd = new Article ("Cas456","ccc",new Prix(10), 20);
		p.Ajouter(cd ,20);
		}
		catch (Exception e){
			
			System.out.println("article non créé car prix incorrect");
		}	
			
		}
	
	
		System.out.println(p.toString());		//on peut faire p seulement il sait que c to String
		System.out.println(p.getPrixTotalHT());
	}


