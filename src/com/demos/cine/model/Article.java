package com.demos.cine.model;

public class Article {
	private double prixHT;
	private String reference;
	private String designation;
	private int qteStock;

	private String type;

	private boolean dematerialise;

//vérification du fonctionnement du merge
	
	public Article(String reference, String designation,double prixHT,int qteStock) {
		super();
		this.prixHT = prixHT;
		this.reference = reference;
		this.designation = designation;
		this.qteStock = qteStock;
		this.dematerialise=false;
	}
	//objets dématérialisés
	public Article(String reference, String designation,double prixHT) {
		super();
		this.prixHT = prixHT;
		this.reference = reference;
		this.designation = designation;
		this.qteStock = 0;
		this.dematerialise=true;
	}




	public boolean isDematerialise() {
		return dematerialise;
	}

	public void setDematerialise(boolean dematerialise) {
		this.dematerialise = dematerialise;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}





	public double getPrixHT() {
		return prixHT;
	}


	public String getReference() {
		return reference;
	}


	public String getDesignation() {
		return designation;
	}


	public int getQteStock() {
		return qteStock;
	}


	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public void incrementeStock (int qte){
		qteStock+=qte;
	}

	public void decrementeStock (int qte){
		qteStock-=qte;
	}

	@Override
	public String toString() {
		String description="";
		if (!isDematerialise()){
			description= "reference=" + reference + ", designation=" + designation + ", prixHT="+ prixHT +" ,qteStock="
				+ qteStock ;
	}
		else{
			description= "reference=" + reference + ", designation=" + designation + ", prixHT="+ prixHT +" ,objet dématerialisé";
		}
		return description;
	}
}
