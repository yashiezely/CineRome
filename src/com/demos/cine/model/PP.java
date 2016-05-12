package com.demos.cine.model;

public class PP {


	public static void main(String[] args) {
	
		Article cassette = new Article ("Cas123","ccc",10, 20);
		Article cd = new Article ("Cas456","ccc",10, 20);
		
		Panier p = new Panier();
		p.Ajouter(cassette,2);
		p.Ajouter(cd,5);

		
		System.out.println(p.toString());
		System.out.println(p.getPrixTotalHT());
	}

}
