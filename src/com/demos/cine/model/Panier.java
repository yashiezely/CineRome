package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {
	

	
	private  int NbElement = 0;
	private  double PrixTotalHT =0;
	
	private ArrayList <LignePanier> Contenu=new ArrayList <LignePanier>();
			

	
	
	public void Ajouter (Article a, int qte){
		
		LignePanier lp= new LignePanier(a,qte);
		Contenu.add (lp);
		//NbElement+=qte;
	}


	@Override
	public String toString() {
		String description="";
		for(LignePanier lp:Contenu){
			description+=lp.getA().getReference() + "   " +lp.getQteCommande()+"\n";
			}
		return description;
	}


	public double getPrixTotalHT(){
		double prix=0;
		for(LignePanier lp:Contenu){
			prix+= lp.getA().getPrixHT()*lp.getQteCommande();
		}
		return prix;
		
	}
	
	
	
}
